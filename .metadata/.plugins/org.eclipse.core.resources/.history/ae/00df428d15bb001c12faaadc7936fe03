package Atelier7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class Fichier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File supermarche=new File("C://Users/simplon/Desktop/java/supermarche.txt");
		
		
		if(!supermarche.exists()) {
			try {
				supermarche.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	
		try {
			
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(supermarche),"UTF-8"));
		String line=reader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=reader.readLine();
		}
		reader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		}

	}

