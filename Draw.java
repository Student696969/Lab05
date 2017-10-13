import java.util.*;
public class DrawApp {
	public static void main(String[] args)
	{
		Rectangle rec=new Rectangle();
		rec.acceptInput();
		rec.computePerimeterArea();
		rec.display();
		
		Square sq2=new Square();
		sq2.acceptInput();
		sq2.computePerimeterArea();
		sq2.display();
		
		Circle c=new Circle();
		c.acceptInput();
		c.computePerimeterArea();
		c.display();
	}
}
