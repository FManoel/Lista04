package Lista04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.Estoque;

public class TesteEstoque 
{
	@Test
	public void testRepor()
	{
		// dado que...
		Estoque estoque1 = new Estoque("Manoel",30,10);
		// quando eu...
		estoque1.repor(5);
		// espero que...
		assertTrue(estoque1.qtdAtual == 35);	
	}
	@Test
	public void testReporFalse()
	{
		// dado que...
		Estoque estoque1 = new Estoque("Manoel",30,10);
		// quando eu...
		estoque1.repor(5);
		// espero que...
		assertFalse(estoque1.qtdAtual != 35);	
	}
	
	@Test
	public void testDarBaixa()
	{
		// dado que...
		Estoque estoque1 = new Estoque("Manoel",30,10);
		//quando eu...
		estoque1.darBaixa(5);
		//espero que...
		assertTrue(estoque1.qtdAtual == 25 );
	}
	@Test
	public void testDarBaixaFalse()
	{
		// dado que...
		Estoque estoque1 = new Estoque("Manoel",30,10);
		//quando eu...
		estoque1.darBaixa(5);
		//espero que...
		assertFalse(estoque1.qtdAtual != 25 );
	}
	@Test
	public void testPrecisaRepor()
	{
		// dado que...
		Estoque estoque1 = new Estoque("Manoel",30,10);
		//quando eu...
		estoque1.precisaRepor();
		//espero que...
		assertTrue(estoque1.precisaRepor() == false);
	}
	@Test
	public void testPrecisaReporFalse()
	{
		// dado que...
		Estoque estoque1 = new Estoque("Manoel",20,30);
		//quando eu...
		estoque1.precisaRepor();
		//espero que...
		assertFalse(estoque1.precisaRepor() != true);
	}

}
