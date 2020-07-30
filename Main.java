package Lista04;

public class Main
{

	public static void main(String[] args)
	{
		Tarefa t1 = new Tarefa("Terminar a folha de pagamento","30/07");
		Tarefa t2 = new Tarefa("varrer a casa","10/07");
		Tarefa t3 = new Tarefa("Lavar a louça","15/07");
		Tarefa t4 = new Tarefa("Estudar","28/07");
		
		//Adiciona as tarefas a minha lista de tarefas.
		ListaDeTarefa.adcionaTarefa(t1);
		ListaDeTarefa.adcionaTarefa(t2);
		ListaDeTarefa.adcionaTarefa(t3);
		ListaDeTarefa.adcionaTarefa(t4);
		
		//O status da tarefa inicia como "Não_feita",esse metodo altera o status para "Feita".
		ListaDeTarefa.alteraStatus(t2);
		ListaDeTarefa.alteraStatus(t4);
		
		//Remove a tarefa passada como parametro.
		ListaDeTarefa.removeTarefa(t2);
		
		//Altera a descrição da minha tarefa.
		ListaDeTarefa.alteraDescricao(t3,"Estudar POO");
		ListaDeTarefa.alteraDescricao(t4,"Estudar muito mais");
		
		//Altera a data da tarefa.
		ListaDeTarefa.alteraData(t4, "29/07");
		
		//Imprime a lista de tarefa.
		ListaDeTarefa.mostraListaDeTarefa();
		
		//O status da tarefa inicia como "Não_feita",esse metodo altera o status para "Feita".
		ListaDeTarefa.alteraStatus(t1);
		//Imprime a tarefa passada como parametro.
		ListaDeTarefa.consultarTarefa(t1);
		
		
	}
}
