import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedWriter writer = null;
	        try {
	            //create a temporary file
	            String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	            File logFile = new File(timeLog);

	            // This will output the full path where the file will be written to...
	            System.out.println(logFile.getCanonicalPath());

	            RoboSim robosin1 = new RoboSim();
	            robosin1.nombre = "CArlos";
	            
	            	
	            
	            
	            writer = new BufferedWriter(new FileWriter(logFile));
	            writer.write("Robosin1 limpio a las: " + timeLog);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                // Close the writer regardless of what happens...
	                writer.close();
	            } catch (Exception e) {
	            }
	        }
	}

}
