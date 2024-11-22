package banco;

public class Banco {
	
	private int agencia; 
	private String nome; 
	private double saldo;
	
	public Banco(int agencia, String nome) {
		this.agencia = agencia;
		this.nome = nome;
	}

	public Banco(int agencia, String nome, double saldoInical) {
		super();
		this.agencia = agencia;
		this.nome = nome;
		deposito(saldoInical);
	}

	protected int getAgencia() {
		return agencia;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
		
	}
	
	public void saque(double saque) {
		saldo -= saque + 5.0;
		
	}

	@Override
	public String toString() {
		return "Dados da conta: Agencia = " + agencia + ", Nome = " + nome + ", Saldo = " + saldo + ".";
	}



	

	
	
	
	
	
	

}
