package Lista04;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.Lampada;



public class TesteLampada 
{
	@Test
	public void testLigada()
	{
		//dado que...
		Lampada l1 = new Lampada();
		//quando eu...
		l1.liga();
		//espero que...
		assertTrue(l1.ligada);
		
	}
	@Test
	public void testDesligada()
	{
		//dado que...
		Lampada l1 = new Lampada();
		//quando eu...
		l1.desliga();
		//espero que...
		assertFalse(l1.ligada);
	}

}
