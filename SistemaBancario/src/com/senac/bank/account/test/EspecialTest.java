package com.senac.bank.account.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.senac.bank.account.Especial;
import com.senac.bank.exceptions.SaldoInsuficienteException;

public class EspecialTest {

	@Test
	public void testGetLimite() {
		Especial conta = new Especial(1000);
		
		assertEquals( 1000 ,  conta.getLimite(), 0 );
	}
	
	@Test
	public void testSacarValorLimiteSemSaldoDisponivel() throws SaldoInsuficienteException {
		Especial conta = new Especial(1000);

		conta.sacar(1000);
		
		assertEquals(-1000, conta.getBalance(), 0);
	}

}
