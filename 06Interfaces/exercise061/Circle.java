package exercise061;

class Circle implements Shape {
	
	protected double radius;
	final double pi = 3.14;
	 
	public double getRadius() {
		return radius;
	}
	 public void setRadius(double radius) {
		this.radius = radius;
	}
	
	Circle (double radius) {
		this.radius = radius;
	}
	
	public void getPerimeter(){
		System.out.println(2*pi*radius);
	}
	
	public void getArea() {
		System.out.println(pi*radius*radius);
	}
	
}
