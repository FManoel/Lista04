package Lista04;

import java.util.Calendar;

public class Data 
{
	private Calendar data;

	@Override
	public String toString() 
	{
		return data.get(Calendar.DAY_OF_MONTH)+"/"+data.get(Calendar.MONTH);
	}
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		Data tmp;
		if (o instanceof Data)
			tmp = (Data) o;
		else
			return false;

		if (this.data.equals(tmp.data))
			return true;
		return false;
	}
	//O metodo recebe uma data em String e converte para int. 
	public void setData(String data)
	{
		String[] listaData = data.split("/");
		int[] diaMes = new int[2];
		diaMes[0] = Integer.valueOf(listaData[0]);
		diaMes[1] = Integer.valueOf(listaData[1]);
		this.data = Calendar.getInstance();
		this.data.set(Calendar.DAY_OF_MONTH, diaMes[0]);
		this.data.set(Calendar.MONTH, diaMes[1]);
	}

	
	Data(String data) 
	{
      setData(data);
	}
}
