package exercise07;
import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args){
        System.out.println("Enter an 8-bit binary number:");
        Scanner userInput = new Scanner(System.in);
        
        int bin = userInput.nextInt();
        int [] array = new int[8];
        int a = bin%10;
        int sum = 0;

	    for (int i = array.length - 1; i >= 0; i--) {
	        array[i] = bin%10;
	        bin /= 10;
	    }
        
        for(int i:array) {
        	sum += i;
        }      
        
        if (sum % 2 == 0 && (sum-a) % 2 == 1 || (sum-a) % 2 == 0) {
        	System.out.println("Parity check OK.");
        	}
        else {
        	System.out.println("Parity check not OK.");
        }        
    }
}