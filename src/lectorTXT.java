
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class lectorTXT {

	public ArrayList<String> leerOracion(){

        ArrayList<String> palabras = new ArrayList<String>();

        try{
            File file = new File("pacientes.txt");

            if(!file.exists()) {
            file.createNewFile();
            }

		    FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            
            String linea = "";
			
			while((linea = breader.readLine()) != null) {

				String[] separar = linea.split(" ");
                
                for(int i = 0; i< separar.length; i++){

                    String val = separar[i];
                    palabras.add(val);
                }
				
                
			}
			
			
			breader.close();
			reader.close();

        } catch (Exception e) {
			e.printStackTrace();
        }
        
        return palabras;
    }

}
