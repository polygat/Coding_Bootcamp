package exercise02;
import java.util.Scanner;
public class Exercise02 {
	public static void main(String args[]){
        int [] banknotes={50,20,10,5,2,1};
        int [] total = new int[6];
        int counter = 0;
        for(int x : banknotes){
            System.out.println(x);
            Scanner mitsos= new Scanner(System.in);
            int poso = mitsos.nextInt();
            System.out.println(x+"eura "+ poso);
            total [counter] = poso;
            counter += 1;
        }
        int sum=0;
        for(int i=0; i<total.length; i++){
            sum=sum+(total[i]*banknotes[i]);
            }
            System.out.print("Synolo "+sum);
    }
}
