package insuranceExtented;
import java.util.ArrayList;
import java.util.List;

public class Life extends Insurance{
	private int amountInvest;
	public static List<Integer> lifeCustomers = new ArrayList<Integer>();

	private static int countLife;
	private static int countInv;
	private static int countAge;
	
	public static int getCountInv() {
		return countInv;
	}

	public static void setCountInv(int countInv) {
		Life.countInv = countInv;
	}

	public static int getCountLife() {
		return countLife;
	}

	public static void setCountLife(int countLife) {
		Life.countLife = countLife;
	}

	public int getInvestor() {
		return amountInvest;
	}

	public void setAmountInvest(int amountInvest) {
		this.amountInvest = amountInvest;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "Life amountInvest = " + amountInvest + ", " + "Life cost = " + this.costCalculation();
	}

	Life(int duration, Customer customer, int amountInvest) {
		super (duration, customer);
		this.amountInvest = amountInvest;
		lifeCustomers.add(customer.getCustomerCodeName());
		countLife += 1;
		countInv += amountInvest;
		countAge += (2017-this.getCustomer().getYearBirth());
	}
	
	public static int getCountAge() {
		return countAge;
	}

	public static void setCountAge(int countAge) {
		Life.countAge = countAge;
	}

	public double costCalculation() {
		return /*super.calcInsuranceCost()+*/5*(2017-this.getCustomer().getYearBirth())+5/100*this.amountInvest;
	}
}