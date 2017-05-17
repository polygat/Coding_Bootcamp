package insurance;

public class Insurance {
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

	public int calcInsuranceCost() {
		// calculating insurance_cost returning: A fixed price of 100 euro:
		int price = 100;
		return price;
	}

	public void allStoredInsurances() {
		// printing all stored insurances
		for (int i = 0; i <= insuranceTab.length; i++) {
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
		// printing a particular insurance (argument : insurance code)
		for (int i = 0; i < autoIncrementNumberOfInsuranceCode; i++) {
			if (customerCodeName == Customer.customerTab[i].getCustomerCodeName()) {
				System.out.println(insuranceTab[i].toString());
			}
		}
	}
}
