package exercise024;
import java.util.Arrays;
public class Exercise024 {
	public static void main(String args[]){

		int i;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] array2 = new Double[array.length];

        System.out.println("Printing Int Array");

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nPrinting Double Array");

        for (i = 0; i < array.length; i++) {
            array2[i] = Double.parseDouble(String.valueOf(array[i]));
        }

        for (i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
	}
}
