package DataAbstrata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	public static void main(String [] args) {
	      Horario h = new Horario();
	      h.setHora(12);
	      h.setMinuto(34);
	      h.setSegundo(12);
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("C:\\Horario.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(h);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in C:/Horario.ser ");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }

}
