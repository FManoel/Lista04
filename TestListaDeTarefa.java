package Lista04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestListaDeTarefa 
{
	
	@Test
	public void testAdicionaTarefa()
	{
		// dado que...
		Tarefa teste = new Tarefa("Teste","28/07");
		//Quando eu...
		ListaDeTarefa.adcionaTarefa(teste);
		//Espero que...
		assertTrue(ListaDeTarefa.getListaTarefas() != null );
		ListaDeTarefa.limparLista();
	}
	@Test
	public void testRemoveTarefa()
	{
		// dado que...
		Tarefa teste = new Tarefa("Teste","28/07");
		//Quando eu...
		ListaDeTarefa.adcionaTarefa(teste);
		boolean resultado = ListaDeTarefa.removeTarefa(teste);
		//Espero que...
		assertTrue(resultado);
		ListaDeTarefa.limparLista();
	}
	@Test
	public void testAlteraData()
	{
		// dado que...
		Tarefa teste = new Tarefa("Teste","28/07");
		//Quando eu...
		ListaDeTarefa.adcionaTarefa(teste);
		boolean resultado = ListaDeTarefa.alteraData(teste,"10/06");;
		//Espero que...
		assertTrue(resultado);
		ListaDeTarefa.limparLista();
	}
	@Test
	public void testAlteraDescricao()
	{
		// dado que...
		Tarefa teste = new Tarefa("Teste","28/07");
		//Quando eu...
		ListaDeTarefa.adcionaTarefa(teste);
		boolean resultado = ListaDeTarefa.alteraDescricao(teste,"Teste 2");;
		//Espero que...
		assertTrue(resultado);
		ListaDeTarefa.limparLista();
	}
	@Test
	public void testAlteraStatus()
	{
		// dado que...
		Tarefa teste = new Tarefa("Teste","28/07");
		//Quando eu...
		ListaDeTarefa.adcionaTarefa(teste);
		boolean resultado = ListaDeTarefa.alteraStatus(teste);;
		//Espero que...
		assertTrue(resultado);
		ListaDeTarefa.limparLista();
	}
	@Test
	public void testConsultarTarefa()
	{
		// dado que...
		Tarefa teste = new Tarefa("Teste","28/07");
		//Quando eu...
		ListaDeTarefa.adcionaTarefa(teste);
		boolean resultado = ListaDeTarefa.consultarTarefa(teste);;
		//Espero que...
		assertTrue(resultado);
		ListaDeTarefa.limparLista();
	}
}
