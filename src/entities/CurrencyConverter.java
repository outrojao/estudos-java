package entities;

public class CurrencyConverter {
	public static double amountToBePaid(double dollarPrice, double amountOfDollars) {
		return dollarPrice * amountOfDollars * 1.06;
	}
}
