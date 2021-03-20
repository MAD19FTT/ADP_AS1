package Nature2;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Bird extends Pane {
	
	public Bird() {
		Polygon wing1 = new Polygon();
		wing1.getPoints().addAll(
				0.0, 15.0,
				50.0, 15.0,
				50.0, 50.0
				);
		wing1.setFill(Color.CYAN);
		wing1.setStroke(Color.BLACK);
		
		Polygon wing2 = new Polygon();
		wing2.getPoints().addAll(
				50.0, 15.0,
				100.0, 50.0,
				50.0, 50.0
				);
		wing2.setFill(Color.CYAN);
		wing2.setStroke(Color.BLACK);
		
		Polygon body = new Polygon();
		body.getPoints().addAll(
				50.0, 50.0,
				100.0, 50.0,
				50.0, 100.0
				);
		body.setFill(Color.CYAN);
		body.setStroke(Color.BLACK);
		
		Polygon tail = new Polygon();
		tail.getPoints().addAll(
				50.0, 75.0,
				75.0, 100.0,
				50.0, 150.0
				);
		tail.setFill(Color.CYAN);
		tail.setStroke(Color.BLACK);
		
		Polygon neck = new Polygon();
		neck.getPoints().addAll(
				86.0, 40.0,
				100.0, 32.5,
				100.0, 50.0
				);
		neck.setFill(Color.CYAN);
		neck.setStroke(Color.BLACK);
		
		Polygon head = new Polygon();
		head.getPoints().addAll(
				100.0, 32.5,
				120.0, 32.5,
				120.0, 50.0,
				100.0, 50.0
				);
		head.setFill(Color.CYAN);
		head.setStroke(Color.BLACK);
		
		Polygon beak1 = new Polygon();
		beak1.getPoints().addAll(
				120.0, 42.5,
				140.0, 57.5,
				120.0, 50.0
				);
		beak1.setFill(Color.YELLOW);
		beak1.setStroke(Color.BLACK);
		
		Polygon beak2 = new Polygon();
		beak2.getPoints().addAll(
				112.5, 50.0,
				120.0, 50.0,
				127.5, 70.0
				);
		beak2.setFill(Color.YELLOW);
		beak2.setStroke(Color.BLACK);
		
		Circle eye = new Circle(115,37.5,1.5);
		eye.setFill(Color.BLACK);
		
		this.getChildren().addAll(
				wing1,
				wing2,
				body,
				tail,
				neck,
				head,
				beak1,
				beak2,
				eye
				);
	}

	public void flipRight() {
		this.setScaleX(1.0);
		
	}
	
	public void flipLeft() {
		this.setScaleX(-1.0);
	
	}
	
}
