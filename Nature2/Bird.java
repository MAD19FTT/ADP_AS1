package Nature2;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Bird extends Pane {
	
	public Bird() {
		Polygon wing1 = new Polygon();
		wing1.getPoints().addAll(
				0.0, 30.0,
				100.0, 30.0,
				100.0, 100.0
				);
		wing1.setFill(Color.CYAN);
		wing1.setStroke(Color.BLACK);
		
		Polygon wing2 = new Polygon();
		wing2.getPoints().addAll(
				100.0, 30.0,
				200.0, 100.0,
				100.0, 100.0
				);
		wing2.setFill(Color.CYAN);
		wing2.setStroke(Color.BLACK);
		
		Polygon body = new Polygon();
		body.getPoints().addAll(
				100.0, 100.0,
				200.0, 100.0,
				100.0, 200.0
				);
		body.setFill(Color.CYAN);
		body.setStroke(Color.BLACK);
		
		Polygon tail = new Polygon();
		tail.getPoints().addAll(
				100.0, 150.0,
				150.0, 200.0,
				100.0, 300.0
				);
		tail.setFill(Color.CYAN);
		tail.setStroke(Color.BLACK);
		
		Polygon neck = new Polygon();
		neck.getPoints().addAll(
				172.0, 80.0,
				200.0, 65.0,
				200.0, 100.0
				);
		neck.setFill(Color.CYAN);
		neck.setStroke(Color.BLACK);
		
		Polygon head = new Polygon();
		head.getPoints().addAll(
				200.0, 65.0,
				240.0, 65.0,
				240.0, 100.0,
				200.0, 100.0
				);
		head.setFill(Color.CYAN);
		head.setStroke(Color.BLACK);
		
		Polygon beak1 = new Polygon();
		beak1.getPoints().addAll(
				240.0, 85.0,
				280.0, 115.0,
				240.0, 100.0
				);
		beak1.setFill(Color.YELLOW);
		beak1.setStroke(Color.BLACK);
		
		Polygon beak2 = new Polygon();
		beak2.getPoints().addAll(
				225.0, 100.0,
				240.0, 100.0,
				255.0, 140.0
				);
		beak2.setFill(Color.YELLOW);
		beak2.setStroke(Color.BLACK);
		
		Circle eye = new Circle(230,75,3);
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

}
