package filehandling2;

import java.io.FileWriter;
import java.io.IOException;

public class file_append {
	public static void main(String[] args) {
	String appe ="the text to be appended";
	 try {
    	 FileWriter input = new FileWriter("new.txt",true);
    	 input.write(appe);
    	 System.out.println("Wriiten succesfully");
    	 input.close();
     }
     catch(IOException e) {
    	 System.out.println("Writing not done");
     }
     
			

}}
