package exercise06;
import java.util.Scanner;
public class Exercise06{
    public static void main(String[] args){
        System.out.println("Enter a 9 digit TIN:");
        Scanner userInput = new Scanner(System.in);
        int tin = userInput.nextInt();
        System.out.println(tin);
        int last = tin%10;
        int num = tin/10;
        int[] array=new int[8];
        
        for(int i=0; i<8;i++){
            int x = num/10;
            int y = num%10;
            num = x;
            array[i] = y;
        }

        int s = 0;
        for(int i=0;i<8;i++){
            s += array[i]*(Math.pow(2,(i+1)));                
        }

        s = (s%11)%10;
        
        if(last==s){
            System.out.println("Tax Identification Number valid.");
        }else{
            System.out.println("Tax Identification Number not valid.");
        }
    }
}