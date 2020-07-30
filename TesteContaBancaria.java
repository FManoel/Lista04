package Lista04;
import Lista03.ContaBancaria;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteContaBancaria 
{
	@Test
	public void testDeposita()
	{
		//dado que...
		ContaBancaria conta = new ContaBancaria();
		//quando eu...
		conta.depositar(600);
		// espero que...
		assertTrue(conta.saldo == 600);
	}
	
	@Test
	public void testSacar()
	{
		//dado que...
		ContaBancaria conta = new ContaBancaria();
		//quando eu...
		conta.depositar(200);
		conta.sacar(50);
		// espero que...
		assertTrue(conta.saldo == 150.0);
	}
	
	@Test
	public void testCalculaRendimento()
	{
		//dado que...
		ContaBancaria conta = new ContaBancaria();
		//quando eu...
		conta.depositar(200);
		conta.calculaRendimento();
		// espero que...
		assertTrue(conta.calculaRendimento() == 20);
	}
	
}
