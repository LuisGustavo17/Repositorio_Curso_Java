package entities;

public class Bank {
	private int numberAccount;
	private String titularName;
	private double saldo;
	
	public static final double TAXA = 5.00;
	
	
	public Bank(int numberAccount, String titularName, double initialDeposit) {
		this.saldo = initialDeposit;
		this.numberAccount = numberAccount;
		this.titularName = titularName;
	}
	public Bank(int numberAccount, String titularName) {
		this.numberAccount = numberAccount;
		this.titularName = titularName;
	}
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public String getTitularName() {
		return titularName;
	}
	public void setTitularName(String titularName) {
		this.titularName = titularName;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDeDeposito) {
		this.saldo += valorDeDeposito;
	}
	public void saque(double valorDeSaque) {
		this.saldo -= valorDeSaque + TAXA;
	}
	
	public String toString() {
		return 	"Account "
				+ numberAccount 
				+ ", "
				+ "Holder: "
				+ titularName
				+ ", "
				+ "Balance "
				+ saldo;
	}
}
