package insuranceExtented;

import java.util.ArrayList;
import java.util.List;

public class Health extends Insurance {
	int medicalExpense;
	public static List<Integer> healthCustomers = new ArrayList<Integer>();

	private static int countHealth;
	private static int sumMedicalExpense;

	public static int getSumMedicalExpense() {
		return sumMedicalExpense;
	}

	public static void setSumMedicalExpense(int sumMedicalExpense) {
		Health.sumMedicalExpense = sumMedicalExpense;
	}

	public static int getCountHealth() {
		return countHealth;
	}

	public static void setCountHealth(int countHealth) {
		Health.countHealth = countHealth;
	}

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
		healthCustomers.add(customer.getCustomerCodeName());
		this.medicalExpense = medicalExpense;
		countHealth += 1;
		sumMedicalExpense += medicalExpense;
	}

	public double costCalculation() {
		if (this.getCustomer().getSex().equals("male")) {
			return /* super.calcInsuranceCost() */80 + 7 * (2017 - this.getCustomer().getYearBirth()) + 50
					+ 2.5 / 100 * this.medicalExpense;
		} else {
			return /* super.calcInsuranceCost() */80 + 7 * (2017 - this.getCustomer().getYearBirth())
					+ 2.5 / 100 * this.medicalExpense;
		}
	}
}