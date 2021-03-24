package studentmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentManagement extends Application{

	public static Stage mainStage;
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(
				getClass()
				.getResource("../view/Login.fxml")
				);
				Scene scene = new Scene(root, 300, 300);
				arg0.setScene(scene);
				arg0.setResizable(false);
				arg0.setTitle("Student Management: Login");
				
				mainStage = arg0;
				
				arg0.show();
			
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
