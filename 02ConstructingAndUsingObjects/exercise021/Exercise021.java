package exercise021;
public class Exercise021 {
	public static void main(String args[]){
		System.out.println(Bootcamp(25,91));
		System.out.println(Bootcamp(91,25));
} 
	public static int Bootcamp (int number1,int number2) {
		 if (number1<number2){
			 int a = number1-number2;
			 int b = Math.abs(a);
			 int c = (int) Math.sqrt(b);
			 return c;
		 } 
		 else {
			 int z = number1+number2;
			 return z;
		 }
	 }
}