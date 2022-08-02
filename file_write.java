package filehandling2;

import java.io.FileWriter;
import java.io.IOException;

public class file_write {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text ="1.string \n 2.new";
         try {
        	 FileWriter input = new FileWriter("new.txt");
        	 input.write(text);
        	 System.out.println("Wriiten succesfully");
        	 input.close();
         }
         catch(IOException e) {
        	 System.out.println("Writing not done");
         }
         
         
	}


}
