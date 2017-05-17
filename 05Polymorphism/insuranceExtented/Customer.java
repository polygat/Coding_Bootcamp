package insuranceExtented;

public class Customer {
	private int customerCodeName;
	private int yearBirth;
	private String sex;
	public static int autoIncrementCustomerCodeName;

	public static Customer[] customerTab = new Customer[10];

	public int getCustomerCodeName() {
		return customerCodeName;
	}

	public void setCustomerCodeName(int customerCodeName) {
		this.customerCodeName = customerCodeName;
	}

	public int getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return " " + customerCodeName + ", yearBirth = " + yearBirth + ", sex = " + sex;
	}

	Customer(int yearBirth, String sex) {
		this.customerCodeName = autoIncrementCustomerCodeName;
		this.yearBirth = yearBirth;
		this.sex = sex;
		customerTab[autoIncrementCustomerCodeName] = this;
		autoIncrementCustomerCodeName += 1;
	}

}