package prob03;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double d) {
		// TODO Auto-generated method stub
		CurrencyConverter.rate = d;
	}

	public static double toDollar(double d) {
		// TODO Auto-generated method stub
		return d/CurrencyConverter.rate;
	}

	public static double toKRW(double d) {
		// TODO Auto-generated method stub
		return d*CurrencyConverter.rate;
	}
}
