package Nature2;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
//import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class birdApp extends Application{
	double orgSceneX, orgSceneY;
	boolean birdflip = false;
	boolean captureWorm = false;
	

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setResizable(false);
		arg0.sizeToScene();
		
		
		Background ground = new Background();
		Bird bird = new Bird();
		//Beak beak = new Beak();
		babyBird baby = new babyBird();
		Worm worm = new Worm();
		
		//worm.setBackground(new javafx.scene.layout.Background(new BackgroundFill(Color.ALICEBLUE, null, null)));
		//System.out.print(worm.getScaleX());
	
		bird.setOnMousePressed(e -> {
		
			
			orgSceneX = e.getSceneX();
			orgSceneY = e.getSceneY();
			
			Bird b = (Bird) e.getSource();
			
			b.toFront();
		});
		
		bird.setOnMouseDragged(e -> {
			double offsetX = e.getSceneX() - orgSceneX;
			double offsetY = e.getSceneY() - orgSceneY;
			
			Bird b = (Bird) e.getSource();
			
			b.setLayoutX(b.getLayoutX() + offsetX);
			b.setLayoutY(b.getLayoutY() + offsetY);
			
			//beak.setLayoutX(beak.getLayoutX() + offsetX);
			//beak.setLayoutY(beak.getLayoutY() + offsetY);
			
			if(captureWorm == true) {
				worm.setLayoutX(worm.getLayoutX() + offsetX);
				worm.setLayoutY(worm.getLayoutY() + offsetY);
			}
			
			orgSceneX = e.getSceneX();
			orgSceneY = e.getSceneY();
			
			if(offsetX >+ 0) {
				b.flipRight();
				
			}
			else if(offsetX <0){
				b.flipLeft();
				//if(birdflip = true) {
					//worm.flipLeft();
				//}
			}
			
			
		});
	
		
		Pane root = new Pane();
		root.getChildren().addAll(ground, bird, baby, worm);
		
		Scene scene = new Scene(root,1000,600);
		scene.setFill(Color.LIGHTBLUE);
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(500), e->{
			baby.moveBeak();
			
		}));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		 Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(5000), e -> {
				
			  int random = (int) ((Math.random() * (450 - 200)) + 250);
				 worm.setLayoutX(random);
				 worm.moveUp();
			  }));
		 animation2.setCycleCount(Timeline.INDEFINITE);
		 animation2.play();
	
		
		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{ // Press space to start the animation
			if(KeyCode.SPACE == e.getCode()) {
				bird.toFront();
				bird.moveWing();
				
			}
		});
		
		
		scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> { //Press M to grab the worm
			if(KeyCode.M == e.getCode()) {
				if(bird.getBoundsInParent().intersects(worm.getBoundsInParent())) {
					captureWorm = true;
					birdflip = true;
					animation2.pause();
					//worm.moveUp.pause();
				}
			}
			if(KeyCode.N == e.getCode()) { // Press N to release the worm
				captureWorm = false;
				if(worm.getBoundsInParent().intersects(baby.getBoundsInParent())) {
					worm.setVisible(false);
					animation.pause();
				}
			}
		});
	
		
		//scene.addEventFilter(MouseEvent.MOUSE_PRESSED, e-> {
		//	bird.toFront();
		//baby.moveBeak();
		//});
		
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
