package Lista04;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Lista03.Quadrado;

public class TesteQuadrado 
{
	@Test
	public void testArea()
	{
		//dado que...
		Quadrado q = new Quadrado(2.0);
		//quando eu...
		q.area();
		//espero que...
		assertTrue(q.area() == 4.0);
	}
	@Test
	public void testPerimetro()
	{
		//dado que...
		Quadrado q = new Quadrado (2.0);
		//quando eu...
		q.perimetro();
		//espero que...
		assertTrue(q.perimetro() == 8.0);
	}

}
