package Nature2;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Background extends Pane{
	
	public Background() {
		Rectangle ground = new Rectangle(0,400,1000,500);
		ground.setFill(Color.BROWN);
		
		Line branch = new Line();
		branch.setStartX(150); 
		branch.setStartY(0);         
		branch.setEndX(150); 
		branch.setEndY(380);
		branch.setStrokeWidth(90);
		branch.setStroke(Color.BLACK);
		
		Line smallBranch = new Line();
		smallBranch.setStartX(150); 
		smallBranch.setStartY(230);         
		smallBranch.setEndX(350); 
		smallBranch.setEndY(230);
		smallBranch.setStrokeWidth(30);
		smallBranch.setStroke(Color.BLACK);
		
		Circle leave1 = new Circle(150,50,30);
		leave1.setFill(Color.GREEN);
		Circle leave2 = new Circle(110,50,30);
		leave2.setFill(Color.GREEN);
		Circle leave3 = new Circle(70,50,30);
		leave3.setFill(Color.GREEN);
		Circle leave4 = new Circle(30,50,30);
		leave4.setFill(Color.GREEN);
		Circle leave5 = new Circle(190,50,30);
		leave5.setFill(Color.GREEN);
		Circle leave6 = new Circle(230,50,30);
		leave6.setFill(Color.GREEN);
		Circle leave7 = new Circle(270,50,30);
		leave7.setFill(Color.GREEN);
		Circle leave8 = new Circle(170,0,30);
		leave8.setFill(Color.GREEN);
		Circle leave9 = new Circle(120,0,30);
		leave9.setFill(Color.GREEN);
		Circle leave10 = new Circle(80,30,30);
		leave10.setFill(Color.GREEN);
		Circle leave11 = new Circle(220,30,30);
		leave11.setFill(Color.GREEN);
	
		
		this.getChildren().addAll(
				branch,
				smallBranch,
				ground,
				leave1,
				leave2,
				leave3,
				leave4,
				leave5,
				leave6,
				leave7,
				leave8,
				leave9,
				leave10,
				leave11
			
				
				);
	}
}
