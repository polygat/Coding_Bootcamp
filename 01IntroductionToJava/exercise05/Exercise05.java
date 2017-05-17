package exercise05;
import java.util.Scanner;
public class Exercise05 {
	public static void main(String args[]){
        System.out.println("Enter number of pronic numbers: ");
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        for (int i=1; i<=num; i++){
        int a = i*(i+1);
        System.out.println(a);
        }
	}
}