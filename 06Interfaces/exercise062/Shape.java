package exercise062;

public class Shape implements Agreeable {
	public int width, height;

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Shape() {
		super();
	}

	public int calcArea() {
		int area = this.width * this.height;
		return area;
	}

	public boolean isSmallerThan(Agreeable shape) {
		Shape b = (Shape) shape;
		if (this.calcArea() < b.calcArea()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Shape a = new Shape();
		Shape b = new Shape(5, 6);
		a.isSmallerThan(b);

	}
}