
public class Square implements IShape{

	private double length;

	Square(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double getArea() {
		
		return length * length;
		
	}
	
}
