package com.senac.util;

public class Pessoa 
{
	private String nome;
	private String endereco;
	private String telefone[];
	
	public Pessoa(String nome, String endereco, String telefone[]) 
	{
		this.nome 				= nome;
		this.endereco 			= endereco;
		this.telefone 			= telefone;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getEndereco()
	{
		return endereco;
	}
	
	public String[] getTelefone()
	{
		return telefone;
	}
	
	public void setTelefone(int indice, String telefone)
	{
		this.telefone[indice] = telefone;
	}
}
