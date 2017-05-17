package insurance;

public class Life extends Insurance {
	private int amountInvest;

	private static Life[] lifeTab = new Life[10];
	private static int countLife;

	public int getInvestor() {
		return amountInvest;
	}

	public void setAmountInvest(int amountInvest) {
		this.amountInvest = amountInvest;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "Life amountInvest = " + amountInvest + ", " + "Life cost = "
				+ this.costCalculation();
	}

	Life(int duration, Customer customer, int amountInvest) {
		super(duration, customer);
		this.amountInvest = amountInvest;
		lifeTab[countLife] = this;
		countLife += 1;
	}

	public double costCalculation() {
		return super.calcInsuranceCost() + 5 * this.getDuration() + 5 / 100 * this.amountInvest;
	}

	public static void printLifeTab() {
		// printing LifeTab
		for (int i = 0; i < countLife; i++) {
			System.out.println(lifeTab[i].toString());
		}
	}
}