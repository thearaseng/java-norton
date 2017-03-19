package semester2.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileRunner {
	
	public static void runWriter() throws IOException{
		
		try{
			FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/src/semester2/file/myfile.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Hello Sunday");
			pw.println("Hello Holiday");
			fw.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void runReader() throws IOException{
		try{
			FileReader fr = new FileReader(System.getProperty("user.dir") + "/src/semester2/file/myfile.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null){
				System.out.println(s);
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
}
