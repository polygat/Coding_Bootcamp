package exercise061;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
        super(radius);
    }
	
	@Override
    public void resize(double percentage) {
        this.radius = percentage * this.radius / 100;
    }

	public static void main (String [] args) {
		ResizableCircle c3 = new ResizableCircle(1);
		c3.getPerimeter();
		c3.getArea();
		c3.resize(10);
		c3.getPerimeter();
		c3.getArea();
	}
}