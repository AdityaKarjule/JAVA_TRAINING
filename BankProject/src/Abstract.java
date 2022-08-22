public class Abstract {
	public static void main(String[] args) {
		
			GeometricalShape gs ;
			
			Circle2 c  = new Circle2();
		
			Rectangle rect = new Rectangle();
			
			Hexagon hex = new Hexagon();
			
			c.draw();
			rect.draw();
			hex.draw();
		
	}
}      

abstract class GeometricalShape 
{
	abstract void draw(); 
	abstract void calcArea();
	abstract void calcPerimeter();
}


class Hexagon extends GeometricalShape
{
	void draw() {
		System.out.println("Hexagon is being drew----");
	}


	void calcArea() {
	
		
	}

	void calcPerimeter() {
			
}
}

class Circle2 extends GeometricalShape
{
	void draw() 
	{
		System.out.println("Circle is being drew----");
	}


	void calcArea() {

		
	}

	@Override
	void calcPerimeter() {
	}
}
class Square extends GeometricalShape
{
	int side;

	


	void calcArea() {
		
		
	}

	void calcPerimeter() {
		
	}
	
	void draw() {
		System.out.println("The square is being drew----");
	}
}

class Rectangle extends Square 
{
	int side2;

	void draw() {
		System.out.println("Rectangle is being drew----");
	}
}