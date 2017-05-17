package insuranceExtented;

import java.util.HashSet;
import java.util.Set;

public abstract class Insurance {
	private int insuranceCode;
	private int duration;
	private Customer customer;
	public static int autoIncrementNumberOfInsuranceCode;

	private static Insurance[] insuranceTab = new Insurance[10];

	public int getInsuranceCode() {
		return insuranceCode;
	}

	public void setInsuranceCode(int insuranceCode) {
		this.insuranceCode = insuranceCode;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Insurance: insuranceCode = " + insuranceCode + ", duration = " + duration + ", customer = " + customer
				+ ",";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	Insurance(int duration, Customer customer) {
		this.insuranceCode = autoIncrementNumberOfInsuranceCode;
		this.duration = duration;
		this.customer = customer;
		insuranceTab[autoIncrementNumberOfInsuranceCode] = this;
		autoIncrementNumberOfInsuranceCode += 1;
	}

	public static void allStoredInsurances() {
		// printing all stored insurances
		for (int i = 0; i < autoIncrementNumberOfInsuranceCode; i++) {
			System.out.println(insuranceTab[i].toString());
		}
	}

	public static void particularInsurance(int insuranceCode) {
		// printing a particular insurance (argument : insurance code)
		for (int i = 0; i < autoIncrementNumberOfInsuranceCode; i++) {
			if (insuranceCode == insuranceTab[i].getInsuranceCode()) {
				System.out.println(insuranceTab[i].toString());
			}
		}
	}

	public static void particularCustomer(int customerCodeName) {
		// printing a particular Customer (argument : customerCodeName)
		for (int i = 0; i < autoIncrementNumberOfInsuranceCode; i++) {
			if (customerCodeName == Customer.customerTab[i].getCustomerCodeName()) {
				System.out.println(insuranceTab[i].toString());
			}
		}
	}

	public abstract double costCalculation();

	public static void overview() {
		/*
		 * Life: number of life insurances, unique customers, average age of
		 * customers and average invested_ amount Health: number of health
		 * insurances, unique customers, and average medical expense
		 */
		int totalLife = Life.getCountLife();
		int totalHealth = Health.getCountHealth();
		int averageInv = Life.getCountInv() / totalLife;
		int averageMedExp = Health.getSumMedicalExpense() / totalHealth;
		int averageLifeAge = Life.getCountAge() / totalLife;
		Set<Integer> uniqueLife = new HashSet<>(Life.lifeCustomers);
		Set<Integer> uniqueHealth = new HashSet<>(Health.healthCustomers);
		System.out.println("---Overview---");
		System.out.println("Life: " + totalLife + " Insurances, " + uniqueLife.size() + " unique customers, "
				+ "average(invested_amount)=" + averageInv + ", average_age=" + averageLifeAge);
		System.out.println("Health: " + totalHealth + " Insurances, " + uniqueHealth.size() + " unique customers,"
				+ " average(Medical_expense)=" + averageMedExp);

	}

}
