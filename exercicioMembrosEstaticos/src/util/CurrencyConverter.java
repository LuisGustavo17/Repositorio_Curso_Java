package util;

public class CurrencyConverter {
public static final double IOF = 0.06;

public static double calculator(double valueDolar, double quantidade) {
	double valorTotal = valueDolar * quantidade;
	valorTotal += valorTotal * IOF;
	return valorTotal;
}


}
