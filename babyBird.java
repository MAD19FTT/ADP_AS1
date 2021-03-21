package Nature2;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.WritableValue;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

public class babyBird extends Pane{
	
	Polygon beak1, beak2;
	boolean beakClose = false;
	
	public babyBird() {
	Arc nest = new Arc(300, 140, 75, 75, 180 + 15, 150);
	nest.setFill(Color.RED);
	
	
	Circle baby = new Circle(300, 150, 20);
	baby.setFill(Color.ORANGE);
	baby.setStroke(Color.BLACK);
	
	beak1 = new Polygon();
	beak1.getPoints().addAll(
			300.0, 130.0,
			310.0, 135.0,
			330.0, 100.0
			);
	beak1.setFill(Color.YELLOW);
	beak1.setStroke(Color.BLACK);
	
	beak2 = new Polygon();
	beak2.getPoints().addAll(
			300.0, 150.0,
			310.0, 135.0,
			350.0, 125.0
			);
	beak2.setFill(Color.YELLOW);
	beak2.setStroke(Color.BLACK);
	
	Circle eye = new Circle(305,140,5);
	
	this.getChildren().addAll(
			beak2,
			beak1,
			baby,
			nest,
			eye
		
			);
	}

	
	public void moveBeak() {
		if(beakClose == false) {
			beak1.getPoints().remove(beak1.getPoints().size() -1);
			beak1.getPoints().remove(beak1.getPoints().size() -1);
			beak1.getPoints().addAll(350.0, 125.0);
			beakClose = true;
		} else {
			beak1.getPoints().remove(beak1.getPoints().size() -1);
			beak1.getPoints().remove(beak1.getPoints().size() -1);
			beak1.getPoints().addAll(330.0, 100.0);
			beakClose = false;
		}
	
}
}