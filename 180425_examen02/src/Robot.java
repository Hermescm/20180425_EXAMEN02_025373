import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Robot implements Runnable{
	boolean available = true;
	Tarea a;
	public Robot() {
		
	}
	
	public void hacerTarea(Tarea a) {
		this.a = a;
		this.run();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		

	}


}