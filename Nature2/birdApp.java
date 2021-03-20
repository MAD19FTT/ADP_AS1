package Nature2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class birdApp extends Application{
	double orgSceneX, orgSceneY;
	boolean captureCircle = false;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setResizable(false);
		arg0.sizeToScene();
		
		
		Background ground = new Background();
		Bird bird = new Bird();
//		bird.setBackground(new javafx.scene.layout.Background(new BackgroundFill(Color.ALICEBLUE, null, null)));
		babyBird baby = new babyBird();
		
		Circle circle = new Circle(800, 500, 10);
		
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
			
			if(captureCircle == true) {
				circle.setLayoutX(circle.getLayoutX() + offsetX);
				circle.setLayoutY(circle.getLayoutY() + offsetY);
			}
			
			orgSceneX = e.getSceneX();
			orgSceneY = e.getSceneY();
			
			if(offsetX >+ 0) {
				b.flipRight();
			}
			else if(offsetX <0){
				b.flipLeft();
			}
			
			
		});
	
		
		
//		Timeline animation = new Timeline(new KeyFrame(Duration.millis(50), e->{}));
//		animation.setCycleCount(Timeline.INDEFINITE);
//		animation.play();
		
		Pane root = new Pane();
		root.getChildren().addAll(ground, bird, baby, circle);
		
		Scene scene = new Scene(root,1000,600);
		scene.setFill(Color.LIGHTBLUE);
		
		scene.addEventFilter(MouseEvent.MOUSE_PRESSED, e-> {
			bird.toFront();
		});
		
		scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {
			if(KeyCode.M == e.getCode()) {
				if(bird.getBoundsInParent().intersects(circle.getBoundsInParent())) {
					captureCircle = true;
				}
			}
			if(KeyCode.N == e.getCode()) {
				captureCircle = false;
			}
		});
		
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
