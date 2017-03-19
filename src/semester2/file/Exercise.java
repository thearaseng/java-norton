package semester2.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
//		One
//		try{
//			exerciseOne();
//		}
//		catch(IOException e){
//			System.out.println(e.getMessage());
//		}
		
//		Two
		try{
			exerciseTwo();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Finished");
	}
	
	static void exerciseOne() throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please save the file name you want to read : ");
		String targetName = scanner.nextLine();
		scanner.close();
		
		FileReader fr = new FileReader(System.getProperty("user.dir") + "/src/semester2/file/" + targetName);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while( (s = br.readLine()) != null ) {
			System.out.println(s);
		}
		fr.close();
	}
	
	static void exerciseTwo() throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please give source file you want to copy : ");
		String sourceName = scanner.nextLine();
		System.out.println(sourceName);
		
		FileReader fr = new FileReader(System.getProperty("user.dir") + "/src/semester2/file/" + sourceName);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.print("Please name the file you want to save : ");
		String targetName = scanner.nextLine();
		scanner.close();
		
		FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/src/semester2/file/" + targetName);
		PrintWriter pw = new PrintWriter(fw);
		
		String tmp;
		while( (tmp = br.readLine()) != null ){
			pw.println(tmp);
		}
		
		fr.close();
		pw.close();
	}

}
