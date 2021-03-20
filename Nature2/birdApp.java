package Nature2;



import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class birdApp extends Application{
	double orgSceneX, orgSceneY;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setResizable(false);
		arg0.sizeToScene();
		
		
		Background ground = new Background();
		Bird bird = new Bird();
		babyBird baby = new babyBird();
		
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
			
			orgSceneX = e.getSceneX();
			orgSceneY = e.getSceneY();
			
		});
		
//		Timeline animation = new Timeline(new KeyFrame(Duration.millis(50), e->{}));
//		animation.setCycleCount(Timeline.INDEFINITE);
//		animation.play();
		
		Pane root = new Pane();
		root.getChildren().addAll(ground, bird, baby);
		
		Scene scene = new Scene(root,1000,600);
		scene.setFill(Color.LIGHTBLUE);
		
		scene.addEventFilter(MouseEvent.MOUSE_PRESSED, e-> {
			bird.toFront();
		});
		
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
