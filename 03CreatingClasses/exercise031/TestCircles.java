package exercise031;
import java.util.Arrays;

public class TestCircles {
	public static void main (String[] args){
		Circle c1 = new Circle(5,5,4);
		c1.printCircleDetail();
		Circle c2 = new Circle();
		c2.printCircleDetail();
		Circle c3 = new Circle(2,1);
		c3.printCircleDetail();
		//7
		System.out.println("c1 Area: " + c1.calculateArea());
		System.out.println("c2 Area: " + c2.calculateArea());
		System.out.println("c3 Area: " + c3.calculateArea());
		System.out.println("c1 Perimeter: " + c1.calculatePerimeter());
		System.out.println("c2 Perimeter: " + c2.calculatePerimeter());
		System.out.println("c3 Perimeter: " + c3.calculatePerimeter());
		//8
		System.out.println("c1 Area: " + c1.calculateArea1());
		System.out.println("c2 Area: " + c2.calculateArea1());
		System.out.println("c2 Area: " + c3.calculateArea1());
		System.out.println("c1 Perimeter: " + c1.calculatePerimeter1());
		System.out.println("c2 Perimeter: " + c2.calculatePerimeter1());
		System.out.println("c2 Perimeter: " + c3.calculatePerimeter1());
		// 9
		Circle original = new Circle(2,1,5);
		Circle copyOfOriginal = new Circle(original);
		original.printCircleDetail();
		copyOfOriginal.printCircleDetail();
		original = new Circle(3,2,1);
		original.printCircleDetail();
		copyOfOriginal.printCircleDetail();
		/* Because copyOfOriginal is a copy of original and shows the position of the original
		 circe in the system memory, by changing the originals circle values, copyOfOriginal
		 will have the same values as original circle had originally.
		 */
		// 10
		 System.out.println(original.cocentric(original,c2));
		 // 11
		 System.out.println("The number of the created circles is: " + Circle.numberOfCreatedCircles);
	}
}