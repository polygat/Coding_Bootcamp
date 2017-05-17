package exercise09;
import java.util.Scanner;
public class Exercise09 {
    public static void main(String[] args){
        System.out.println("Enter a 9 digit number:");
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        int [] array = new int[9];
        
        for(int i=8; i>=0; i--){
            int x = num/10;
            int y = num%10;
            num = x;
            array[i] = y;
        }
        
        for(int i=0;i<9;i+=3){
            System.out.print(array[i] + " ");                
        }
        
        System.out.println("");
        
        for(int i=1;i<9;i+=3){
            System.out.print(" " + array[i]);
        }
        
        System.out.println("");
        System.out.print(" ");
        
        for(int i=2;i<9;i+=3){
            System.out.print(" " + array[i]);
        }
        
    }
}