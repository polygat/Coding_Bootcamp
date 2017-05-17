package exercise023;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise023 {
	public static void main(String args[]){
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        System.out.println("give a number :");
        shift(array);
	}
	private static void shift(int[] array) {
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        for (int j = 0; j < num; j++) {
            int last = array[array.length - 1];
            for (int i = (array.length - 2); i >= 0; i--) {
                array[i + 1] = array[i];
            }
            array[0] = last;
            System.out.println(Arrays.toString(array));
        }
    }
}