package exercise03;

import java.util.Scanner;
public class Exercise03 {
	int a;
	int b;
	int c;
    public static void main(String[] args){
    System.out.println("Enter a: ");
    Scanner aInput = new Scanner(System.in);
    int a = aInput.nextInt();
    System.out.println("Enter b: ");
    Scanner bInput = new Scanner(System.in);
    int b = bInput.nextInt();
    System.out.println("Enter c: ");
    Scanner cInput = new Scanner(System.in);
    int c = cInput.nextInt();
    System.out.println("a:" + a + ", b:" + b + ", c:" + c);
    double d = (Math.pow(b,2)-4*a*c);
    double z = Math.sqrt(d);
    double x1 = ((-b+z)/(2*a));
    double x2 = ((-b-z)/(2*a));
    double t1 = (a*Math.pow(x1, 2) + b*x1 + c);
    double t2 = (a*Math.pow(x2, 2) + b*x2 + c);
 
     	if (d>=0 && t1==0 || t2==0){
     		System.out.println("Quadratic Equations results are: " + x1 + " and " + x2);
     	}
     	else {
     		System.out.println("Quadratic Equation can't be resolved with the given numbers.");
     	}
     	
    }

}