
public class GeometryApplication {

	// The following method violates the Open/Closed Principle
	// To make this method work for shapes that include Triangles, 
	// we'd have to modify the method. 
	public static double sumArea(Object[] shapes) {
		double area = 0;
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] instanceof Square) {
			    double length = ((Square)shapes[i]).getLength();   
				area += length * length;  
			}
			if (shapes[i] instanceof Circle)
			{
				double radius = ((Circle)shapes[i]).getRadius();
			  area += Math.PI * (radius * radius);
			}
		}
		return area;
	}

	public static double sumArea2(IShape[] shapes) {
		
		double area =0;
		
		for(int i =0; i< shapes.length; i ++) {
			area += shapes[i].getArea();
			
		}
		return area;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Object[] shapes = new Object[4];
		
		shapes[0] = new Circle(2);
		shapes[1] = new Circle(4);
		shapes[2] = new Square(2);
		shapes[3] = new Triangle(1,1);
		
		System.out.println(sumArea(shapes));
	}

}
