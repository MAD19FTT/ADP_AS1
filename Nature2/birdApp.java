package Nature2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class birdApp extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setResizable(false);
		arg0.sizeToScene();
		
		
		Background ground = new Background();
		Bird bird = new Bird();
		
		Pane root = new Pane();
		root.getChildren().addAll(ground, bird);
		
		Scene scene = new Scene(root,1000,600);
		scene.setFill(Color.LIGHTBLUE);
		
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

