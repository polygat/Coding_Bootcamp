package exercise071;

public class Bootcamp {
	public static void welcome(double something) throws DigitException, AnotherDigitException {
		if (something > 25) {
			throw new DigitException();
		} else {
			throw new AnotherDigitException();
		}
	}

	public static int bye() {
		try {
			welcome(299.7);
		} catch (DigitException e) {
			return 605;
		} catch (AnotherDigitException e) {
			return 230;
		}
		return 0;
	}

	public static void main(String[] args) {
		bye();
	}

}