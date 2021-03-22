package Nature2;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Bird extends Pane {
	boolean wingUp = false;
	Polygon wing1, wing2;
	
	public Bird() {
		wing1 = new Polygon();
		wing1.getPoints().addAll(
				0.0, 22.5,
				75.0, 22.5,
				75.0, 75.0
				);
		wing1.setFill(Color.CYAN);
		wing1.setStroke(Color.BLACK);
		
		wing2 = new Polygon();
		wing2.getPoints().addAll(
				150.0, 75.0,
				75.0, 22.5,
				75.0, 75.0
				);
		wing2.setFill(Color.CYAN);
		wing2.setStroke(Color.BLACK);
		
		Polygon body = new Polygon();
		body.getPoints().addAll(
				75.0, 75.0,
				150.0, 75.0,
				75.0, 150.0
				);
		body.setFill(Color.CYAN);
		body.setStroke(Color.BLACK);
		
		Polygon tail = new Polygon();
		tail.getPoints().addAll(
				75.0, 112.5,
				112.5, 150.0,
				75.0, 225.0
				);
		tail.setFill(Color.CYAN);
		tail.setStroke(Color.BLACK);
		
		Polygon neck = new Polygon();
		neck.getPoints().addAll(
				129.0, 60.0,
				150.0, 48.75,
				150.0, 75.0
				);
		neck.setFill(Color.CYAN);
		neck.setStroke(Color.BLACK);
		
		Polygon beak1 = new Polygon();
		beak1.getPoints().addAll(
				180.0, 63.75,
				210.0, 86.25,
				180.0, 75.0
				);
		beak1.setFill(Color.YELLOW);
		beak1.setStroke(Color.BLACK);
		
		
		Polygon beak2 = new Polygon();
		beak2.getPoints().addAll(
				168.75, 75.0,
				180.0, 75.0,
				191.25, 105.0
				);
		beak2.setFill(Color.YELLOW);
		beak2.setStroke(Color.BLACK);
		
		Polygon head = new Polygon();
		head.getPoints().addAll(
				150.0, 48.75,
				180.0, 48.75,
				180.0, 75.0,
				150.0, 75.0
				);
		head.setFill(Color.CYAN);
		head.setStroke(Color.BLACK);
		
		Circle eye = new Circle(172.5,56.25,2.25);
		eye.setFill(Color.BLACK);
		
		this.getChildren().addAll(
				body,
				tail,
				neck,
				beak1,
				beak2,
				head,
				eye,
				wing1,
				wing2
				);
		this.setTranslateX(60);
		this.setTranslateY(50);
		this.setScaleX(1.25);
		this.setScaleY(1.25);
	}

	public void flipRight() {
		this.setScaleX(1.25);
	}
	
	public void flipLeft() {
		this.setScaleX(-1.25);
	
	}
	
	public void moveWing() {
		if(wingUp == false) {
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing1.getPoints().addAll(70.0, 90.0, 85.0, 140.0, 0.0, 185.0);
			wing2.getPoints().addAll(150.0, 75.0, 70.0, 90.5, 85.0, 140.0);
			//System.out.println(wing1.getPoints().size()-1);
			wingUp = true;
		} else {
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing1.getPoints().remove(wing1.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing2.getPoints().remove(wing2.getPoints().size()-1);
			wing1.getPoints().addAll(0.0, 22.5, 75.0, 22.5, 75.0, 75.0);
			wing2.getPoints().addAll(150.0, 75.0, 75.0, 22.5, 75.0, 75.0);
			wingUp = false;
		}
	}
	
}
