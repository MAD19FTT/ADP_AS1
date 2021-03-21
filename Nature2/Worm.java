package Nature2;


import javafx.animation.TranslateTransition;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;


public class Worm extends Pane {
	int random = (int) ((Math.random() * (450 - 200)) + 250);
	
	public Worm() {
		
		QuadCurve head = new QuadCurve(
				525, 255,
				532.5, 236.25,
				540, 255
				);
		head.setFill(Color.PEACHPUFF);
		head.setStroke(Color.BLACK);
		
		Polygon body1 = new Polygon(
				525, 255,
				540, 255,
				540, 270,
				525, 270
				);
		body1.setFill(Color.PEACHPUFF);
		body1.setStroke(Color.BLACK);
		
		Polygon body2 = new Polygon(
				525, 270,
				540, 270,
				540, 285,
				525, 285
				);
		body2.setFill(Color.PEACHPUFF);
		body2.setStroke(Color.BLACK);
		
		Polygon body3 = new Polygon(
				525, 285,
				540, 285,
				540, 300,
				525, 300
				);
		body3.setFill(Color.PEACHPUFF);
		body3.setStroke(Color.BLACK);
		
		Polygon body4 = new Polygon(
				525, 300,
				540, 300,
				540, 315,
				525, 315
				);
		body4.setFill(Color.PEACHPUFF);
		body4.setStroke(Color.BLACK);
		
		Polygon body5 = new Polygon(
				525, 315,
				540, 315,
				540, 330,
				525, 330
				);
		body5.setFill(Color.PEACHPUFF);
		body5.setStroke(Color.BLACK);
		
		Polygon body6 = new Polygon(
				525, 330,
				540, 330,
				540, 345,
				525, 345
				);
		body6.setFill(Color.PEACHPUFF);
		body6.setStroke(Color.BLACK);
		
		QuadCurve tail = new QuadCurve(
				540, 345.75,
				532.5, 352.5,
				525, 345.75
				);
		tail.setFill(Color.PEACHPUFF);
		tail.setStroke(Color.BLACK);
		
		Circle eye = new Circle(531,249,1);
		eye.setFill(Color.BLACK);
		
		this.getChildren().addAll(
				head,
				body1,
				body2,
				body3,
				body4,
				body5,
				body6,
				tail,
				eye
				);
		this.setTranslateY(100);
		
	}

	public void moveUp() {
		TranslateTransition move = new TranslateTransition();
		move.setNode(this);
		move.setByY(-70);
		move.setAutoReverse(true);
		move.setCycleCount(300);
		move.setDuration(Duration.millis(500));
		move.play();
	}

	public void flipRight() {
		this.setTranslateX((this.getTranslateX()) + 190);
		System.out.print(this.getTranslateX());
	}
	
	public void flipLeft() {
		this.setTranslateX((this.getTranslateX()) -190);
		System.out.print(this.getTranslateX());
	}
	
}
