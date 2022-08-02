package filehandling2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_read {
	 public void main(String[] args) throws IOException {
    	 char[] text=new char[100];
    	 try {
    		 FileReader input= new FileReader("new.txt");
    		 input.read(text);
    	     System.out.println("Text is read from file");
    	     System.out.println(text);
    	     input.close();
    	 }
    	 catch (FileNotFoundException e) {
    		 System.out.println("Error in reading the file");
    	 }
     }
}


