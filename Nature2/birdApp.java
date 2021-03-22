package Nature2;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class birdApp extends Application{
	double orgSceneX, orgSceneY;
	boolean birdflip = false;
	boolean captureWorm = false;
	boolean babycapture = false;

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
		

		 Timeline animation0 = new Timeline(new KeyFrame(Duration.millis(150), e -> { //animation for flapping wing
		 bird.moveWing();
		 }));
	
		 
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
			
			animation0.setCycleCount(Timeline.INDEFINITE);
			animation0.play();
			
			if(offsetX >+ 0) {
				b.flipRight();
				//if(birdflip = true) {
					//worm.flipRight();
				//}
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
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(500), e->{ //animation for baby beak open and close
			baby.moveBeak();
			
		}));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		 Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(5000), e -> { //animation for worm move in random hole appear
				
			  int random = (int) ((Math.random() * (450 - 200)) + 250);
				 worm.setLayoutX(random);
			  }));
		 animation2.setCycleCount(Timeline.INDEFINITE);
		 animation2.play();
		 
		scene.addEventFilter(KeyEvent.KEY_PRESSED, e ->{ // Press space to start the animation
			if(KeyCode.SPACE == e.getCode()) {
				bird.toFront();
				
			}
		});
		
		scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> { //Press M to grab the worm
			if(KeyCode.M == e.getCode()) {
				if(bird.getBoundsInParent().intersects(worm.getBoundsInParent())) {
					captureWorm = true;
					birdflip = true;
					babycapture = true;
					animation2.pause();

					
				}
			}
			if(KeyCode.N == e.getCode()) { // Press N to release the worm
				captureWorm = false;
				babycapture = false;
				if(worm.getBoundsInParent().intersects(baby.getBoundsInParent())) {
					worm.setVisible(false);
					animation.pause();
					babycapture = false;
					 
				}
				
			}
		});
	
		
		//if(babycapture = false) {
		//Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(1000), e->{ //animation for worm drop
			//worm.setTranslateY(300);
		//}));
		//animation3.play();
		//}
		
		 worm.moveUp(babycapture);
		 
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
