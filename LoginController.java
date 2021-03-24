package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import studentmanagement.StudentManagement;

public class LoginController {
	@FXML
	HBox passwordHBox;
	@FXML
	TextField usernameTextField;
	@FXML
	TextField passwordPasswordField;
	@FXML
	Label errorLabel;
	
	public void login() throws IOException {
		String username = usernameTextField.getText();
		String password = passwordPasswordField.getText();
		if(username.toLowerCase().equals("jailani") && 
				password.equals("Rahman")) {
			Parent root = FXMLLoader.load(
					getClass()
					.getResource("../view/Dashboard.fxml")  //redirects to the dashboard pane
							);
			Scene scene = new Scene(root);
			StudentManagement.mainStage.setScene(scene);
			StudentManagement.mainStage.setResizable(true);
			StudentManagement.mainStage.setTitle("Student Management: Dashboard");
			StudentManagement.mainStage.show();
		} else {
			errorLabel.setText("Wrong credential.");
		}
		
		
	}
	
	public void clear() {
		usernameTextField.clear();
		passwordPasswordField.clear();
	}
	
	public void showPassword(ActionEvent e) {
		CheckBox checkbox =(CheckBox) e.getSource();
		
		if(checkbox.isSelected()) {
			String password  = passwordPasswordField.getText();
			passwordHBox.getChildren().remove(passwordPasswordField);
			passwordPasswordField = new TextField(password);
			passwordHBox.getChildren().add(passwordPasswordField);
		}
		else {
			System.out.println("Unchecked");
		}
		
	}
	
}
