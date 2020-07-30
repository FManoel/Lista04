package Lista04;

import java.util.ArrayList;

public class ListaDeTarefa
{
	private static ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();
	
	
	public static void limparLista()
	{
		listaTarefas = null;
	}
	public static ArrayList<Tarefa> getListaTarefas() 
	{
		return listaTarefas;
	}
// Adiciona uma tarefa a minha lista de tarefas.
	static  boolean adcionaTarefa(Tarefa t)
	{
		if(listaTarefas == null)
		{
			listaTarefas = new ArrayList<Tarefa>();
		}
		return listaTarefas.add(t);
	}
	// Remove uma tarefa da minha lista de tarefas.
	static  boolean removeTarefa(Tarefa t)
	{
		return listaTarefas.remove(t); 
		 
	}
	// Imprime a tarefa passada como parametro.
	static  boolean consultarTarefa(Tarefa t)
	{
		for (Tarefa tarefa : listaTarefas) 
		{
			if(t.equals(tarefa))
			{
				System.out.println(tarefa.getDescricao());
				System.out.println(tarefa.getData());
				System.out.println(tarefa.getStatus() + "\n");
				return true;
			}
		}
		return false;
		
	}
	//Modifica o status de "Não_feita" para "Feita".
	static  boolean alteraStatus(Tarefa t)
	{
		for (Tarefa tarefa : listaTarefas) 
		{
			if(t.equals(tarefa))
			{
				tarefa.setStatus(Status.Feita);
				return true;
			}
		}
		return false;
	}
	//Modifica a data da minha tarefa.
	static  boolean alteraData(Tarefa t, String data)
	{
		for (Tarefa tarefa : listaTarefas) 
		{
			if(t.equals(tarefa))
			{
				tarefa.getData().setData(data);
				return true;
			}
		}
		return false;
	}
	// Modifica a descrição da tarefa.
	static  boolean alteraDescricao(Tarefa t, String descricao)
	{
		for (Tarefa tarefa : listaTarefas) 
		{
			if(t.equals(tarefa))
			{
				tarefa.setDescricao(descricao); 
				return true;
			}
		}
		return false;
	}
	//Imprime a lista de tarefa.
	static void mostraListaDeTarefa()
	{
		for(Tarefa tarefa : listaTarefas)
		{
			System.out.println(tarefa.getDescricao());
			System.out.println(tarefa.getData());
			System.out.println(tarefa.getStatus() + "\n");
		}
	}

}
