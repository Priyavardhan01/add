package filehandling2;
import java.io.File;
import java.io.IOException;

public class filre_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File File = new File("new.txt");
	     
		try {
			if(File.createNewFile()) {
				System.out.println("File created  Successfully");
			}
			else {
				System.out.println("File creation error");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



