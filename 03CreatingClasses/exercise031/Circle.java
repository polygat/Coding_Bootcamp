package exercise031;
public class Circle {
	
	private int x;
	private int y;
	private int z;
	public static int numberOfCreatedCircles; // for step 11
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	Circle() {
	    this.x = 0 ;
	    this.y = 0;
	    this.z = 5;
	    numberOfCreatedCircles += 1;
	}
	Circle(int x, int y, int z) {
	    this.x = x;
	    this.y = y;
	    this.z = z;
	    numberOfCreatedCircles += 1;
	}
	public void printCircleDetail(){
		System.out.println("I'm a circle at point ("+x+","+y+") with radius "+z);
	}
	Circle(int x, int y) {
		this();
	    this.x = x;
	    this.y = y;
	}
	// 7
	public double calculateArea(){
		double π = 3.14;
		double area = (π*Math.pow(z, 2));
		return (area);
	}
	public double calculatePerimeter(){
		double π = 3.14;
		double perimeter = (π*2*z);
		return (perimeter);
	}
	// 8 
	private static final double pi = 3.14 ;

	public double calculateArea1(){
		double area = (pi*Math.pow(z, 2));
		return (area);
	}
	public double calculatePerimeter1(){
		double perimeter = (pi*2*z);
		return (perimeter);
	}
	// 9
	public Circle(Circle original) {
	    this(original.x, original.y, original.z);
	}
	// 10 the return type of the method is boolean (true, false)
	// What type of argument should your method have? Circle
	public boolean cocentric(Circle one, Circle two){
		if (one.getX()==two.getX() && one.getY()==two.getY()){
			return(true);
		} else {
			return(false);
		}
	}
}