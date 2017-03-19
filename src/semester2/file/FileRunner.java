package semester2.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileRunner {
	
	public static void run() throws IOException{
		
		try{
			FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/src/semester2/file/myfile.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.print("Hello Sunday");
			fw.close();
			System.out.println(System.getProperty("user.dir"));
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	
}
