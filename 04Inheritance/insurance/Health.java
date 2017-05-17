package insurance;

public class Health extends Insurance {
	int medicalExpense;

	private static Health[] healthTab = new Health[10];
	private static int countHealth;

	public int getMedicalExpense() {
		return medicalExpense;
	}

	public void setMedicalExpense(int medicalExpense) {
		this.medicalExpense = medicalExpense;
	}

	public String toString() {
		return super.toString() + " Health medicalExpense = " + medicalExpense + ", Health cost = "
				+ this.costCalculation();
	}

	Health(int duration, Customer customer, int medicalExpense) {
		super(duration, customer);
		this.medicalExpense = medicalExpense;
		healthTab[countHealth] = this;
		countHealth += 1;
	}

	public double costCalculation() {
		if (this.getCustomer().getSex().equals("male")) {
			return super.calcInsuranceCost() + 7 * (2017 - this.getCustomer().getYearBirth()) + 50
					+ 2.5 / 100 * this.medicalExpense;
		} else {
			return super.calcInsuranceCost() + 7 * (2017 - this.getCustomer().getYearBirth())
					+ 2.5 / 100 * this.medicalExpense;
		}
	}

	public static void printHealthTab() {
		// printing HealthTab
		for (int i = 0; i < countHealth; i++) {
			System.out.println(healthTab[i].toString());
		}
	}
}