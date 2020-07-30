package Lista04;


public class Tarefa 
{
	private Status status;
	private String descricao;
	private Data data;
	
	

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		Tarefa tmp;
		if (o instanceof Tarefa)
			tmp = (Tarefa) o;
		else
			return false;

		if (this.descricao.equals(tmp.descricao) && this.data.equals(tmp.data) && this.status == tmp.status)
			return true;
		return false;
	}
	
	
	public Status getStatus() 
	{
		return status;
	}
	public void setStatus(Status status) 
	{
		this.status = status;
	}
	public String getDescricao() 
	{
		return descricao;
	}
	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}
	public Data getData() 
	{
		return data;
	}
	public void setData(Data data) 
	{
		this.data = data;
	}
Tarefa ( String descricao,String data)
{
	setStatus(Status.Não_feita);
	setDescricao(descricao);
	this.data = new Data(data);
}

}
