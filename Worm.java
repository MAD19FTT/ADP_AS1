import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Worm extends Pane {
	
	public Worm() {
		
		QuadCurve head = new QuadCurve(
				0, 40,
				10, 15,
				20, 40
				);
		head.setFill(Color.PEACHPUFF);
		head.setStroke(Color.BLACK);
		
		Polygon body1 = new Polygon(
				0, 40,
				20, 40,
				20, 60,
				0, 60
				);
		body1.setFill(Color.PEACHPUFF);
		body1.setStroke(Color.BLACK);
		
		Polygon body2 = new Polygon(
				0, 60,
				20, 60,
				20, 80,
				0, 80
				);
		body2.setFill(Color.PEACHPUFF);
		body2.setStroke(Color.BLACK);
		
		Polygon body3 = new Polygon(
				0, 80,
				20, 80,
				20, 100,
				0, 100
				);
		body3.setFill(Color.PEACHPUFF);
		body3.setStroke(Color.BLACK);
		
		Polygon body4 = new Polygon(
				0, 100,
				20, 100,
				20, 120,
				0, 120
				);
		body4.setFill(Color.PEACHPUFF);
		body4.setStroke(Color.BLACK);
		
		Polygon body5 = new Polygon(
				0, 120,
				20, 120,
				20, 140,
				0, 140
				);
		body5.setFill(Color.PEACHPUFF);
		body5.setStroke(Color.BLACK);
		
		Polygon body6 = new Polygon(
				0, 140,
				20, 140,
				20, 160,
				0, 160
				);
		body6.setFill(Color.PEACHPUFF);
		body6.setStroke(Color.BLACK);
		
		QuadCurve tail = new QuadCurve(
				20, 161,
				10, 170,
				0, 161
				);
		tail.setFill(Color.PEACHPUFF);
		tail.setStroke(Color.BLACK);
		
		Circle eye = new Circle(8,32,1);
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
		
	}

}
