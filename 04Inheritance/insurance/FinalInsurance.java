package insurance;

import java.util.Scanner;

public class FinalInsurance {
	public static void main(String[] args) {
		/** Create Random Customer */
		Customer cust1 = new Customer(1982, "male");
		Customer cust2 = new Customer(1974, "female");
		Customer cust3 = new Customer(1985, "male");
		Customer cust4 = new Customer(1993, "female");
		Customer cust5 = new Customer(1988, "male");
		Customer cust6 = new Customer(1992, "female");
		Customer cust7 = new Customer(2000, "male");
		Customer cust8 = new Customer(1990, "female");
		Customer cust9 = new Customer(1980, "male");
		Customer cust10 = new Customer(1965, "female");

		Life life1 = new Life(1, cust1, 10);
		Life life2 = new Life(2, cust3, 30);
		Life life3 = new Life(3, cust5, 50);
		Life life4 = new Life(4, cust7, 70);
		Life life5 = new Life(5, cust9, 90);

		Health health1 = new Health(6, cust2, 20);
		Health health2 = new Health(7, cust4, 40);
		Health health3 = new Health(8, cust6, 60);
		Health health4 = new Health(9, cust8, 80);
		Health health5 = new Health(10, cust10, 100);

		printRun();
	}

	public static void printRun() {
		while (true) {
			Scanner menu = new Scanner(System.in);
			System.out.print(
					"***** Menu ***** \n1. Print all Insurances\n2. Search insurances by customer code\n3. Search insurances by insurance code\n");

			int num = menu.nextInt();

			switch (num) {
			case 1:
				Life.printLifeTab();
				Health.printHealthTab();
				break;

			case 2:
				System.out.print("Give a customer code");
				Scanner cc = new Scanner(System.in);
				int x = cc.nextInt();
				Insurance.particularCustomer(x);
				break;

			case 3:
				System.out.print("Give a insurance code");
				Scanner ic = new Scanner(System.in);
				int y = ic.nextInt();
				Insurance.particularInsurance(y);
				break;

			case 0:
				return;

			default:
				System.out.println("Wrong");
				break;
			}
		}
	}

}