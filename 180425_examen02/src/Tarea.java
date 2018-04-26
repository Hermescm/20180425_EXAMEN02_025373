import java.io.Serializable;
import java.sql.Date;

public abstract class Tarea implements Serializable {
	String estado;
	Date inicio;
	Date fin;

	public abstract void hacerTarea();

	public Date inicio(){
		return inicio;
	}

	public Date fin(){
		return fin;
	}

	public String estado(){
		return estado;
	}

	public void estadoSet(String s){
		this.estado = s;
	}
}