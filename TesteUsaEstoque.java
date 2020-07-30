package Lista04;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.Estoque;


public class TesteUsaEstoque 
{
	@Test
	public void testEstoque1()
	{
		// dado que...
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta",13,6);
		//quando eu...
		estoque1.darBaixa(5);
		//espero que...
		assertTrue(estoque1.qtdAtual == 8 );
	}
	
	@Test
	public void testEstoque2()
	{
		// dado que...
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas",11,13);
		//quando eu...
		estoque2.repor(7);
		//espero que...
		assertTrue(estoque2.qtdAtual == 18 );
	}
	
	@Test
	public void testEstoque3()
	{
		// dado que...
		Estoque estoque3 = new Estoque("Mouse Ótico",6,2);
		//quando eu...
		estoque3.darBaixa(4);
		//espero que...
		assertTrue(estoque3.qtdAtual == 2 );
	}

}
