package insuranceExtented;

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

		Life life1 = new Life(1, cust1, 10);
		Life life2 = new Life(2, cust3, 30);
		Life life3 = new Life(3, cust5, 50);
		Life life4 = new Life(4, cust7, 70);
		Life life5 = new Life(5, cust9, 90);

		Health health1 = new Health(6, cust2, 20);
		Health health2 = new Health(7, cust4, 40);
		Health health3 = new Health(8, cust6, 60);
		Health health4 = new Health(9, cust6, 80);

		printRun();
	}

	public static void printRun() {
		while (true) {
			Scanner menu = new Scanner(System.in);
			System.out.print(
					"***** Menu ***** \n1. Print all Insurances\n2. Search insurances by customer code\n3. Search insurances by insurance code\n4. Create a new customer\n5. Overview\n0. Quit\n");

			int num = menu.nextInt();

			switch (num) {
			case 1:
				Insurance.allStoredInsurances();
				break;

			case 2:
				System.out.print("Give a customer code.");
				Scanner cc = new Scanner(System.in);
				int x = cc.nextInt();
				Insurance.particularCustomer(x);
				break;

			case 3:
				System.out.print("Give a insurance code.");
				Scanner ic = new Scanner(System.in);
				int y = ic.nextInt();
				Insurance.particularInsurance(y);
				break;

			case 4:
				System.out.print("Create a new customer. (yearBirth, sex)\n");

				Scanner newc = new Scanner(System.in);
				int yearBirth = newc.nextInt();
				String sex = newc.next();
				Customer cust10 = new Customer(yearBirth, sex);

				System.out.println("Type of Insurance");
				Scanner newI = new Scanner(System.in);
				String typeI = newI.next();
				if (typeI.equals("Life") || typeI.equals("life")) {
					System.out.println("Enter Life details. (duration, investment amount)\n");
					Scanner newd = new Scanner(System.in);
					int typed = newd.nextInt();
					int typeInv = newd.nextInt();
					Life life6 = new Life(typed, cust10, typeInv);
				} else if (typeI.equals("Health") || typeI.equals("health")) {
					System.out.println("Enter Health details. (duration, medical expenses)\n");
					Scanner newd = new Scanner(System.in);
					int typed = newd.nextInt();
					int medExp = newd.nextInt();
					Life life6 = new Life(typed, cust10, medExp);
				}
				break;
			case 5:
				Insurance.overview();
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