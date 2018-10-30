
public class Circle implements IShape {

	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	
	public double getArea() {
		return radius*radius*3.14;
	}

}
