package model;

public class Lab02ContaCorrente {

	private int numAge;
	private int numConta;
	private String nome;
	private double saldo;
	
	public void imprimir(){
		
		System.out.println("Agência: " + numAge + " ");
		System.out.println("Conta: " + numConta + " ");
		System.out.println("Cliente: " + nome + " ");
		System.out.println("Saldo: " + saldo + "\n");
	}
	
	public int sacar (double pValor) {
	
		if (saldo>pValor){
			saldo = saldo - pValor;
			return 1;
			
		}else{
			
			return 0;
		}
	}
	
	public void depositar (double pValor) {
				
			saldo = saldo + pValor;
			
	}
		
	
	public int getNumAge() {
		return numAge;
	}
	public void setNumAge(int numAge) {
		this.numAge = numAge;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
