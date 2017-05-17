package exercise01;

public class Exercise01 {
	public static void main(String[] args) {
    	for (int i = 1; i < 10; i++) {
    	    for (int j = 9; j > 0; j--) {
    	        if (i<j)
    	            System.out.print(0);
    	        else
    	        	System.out.print(i);
    	    }
    	    System.out.println();
    	}
    }
}
