package com.senac.bank.account;

public class Investimento extends Conta
{
	private int data;
	private final String type = "Investimento";
	
	public Investimento() 
	{
		super();
		this.data = 0;
	}

	// Retorna a data de criacao da conta.
	public int getDataCriacao() 
	{
		return this.data;
	}
	
	// Gera um aumento do saldo de acordo com a taxa, e deposita na conta.
	public void dividendos( double taxa )
	{
		double value = ( (getBalance() / 100 ) * taxa );
		depositar(value);
	}
	
	public String getType() {
		return type;
	}
	
}
