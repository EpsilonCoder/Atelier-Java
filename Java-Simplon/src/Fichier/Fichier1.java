package Fichier;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fichier1 {

	public static void main(String[] args) {
	
		File fichier=new File("C://Users/simplon/Desktop/nice.txt");
		
		if(!fichier.exists()) {
			try {
				fichier.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		try {
			FileWriter ecrire=new FileWriter(fichier);
			BufferedWriter bw=new BufferedWriter(ecrire);
			
			bw.write("Epsilon Coder vient d enregister des donnees");
			bw.newLine();
			bw.write("JE suis le puissant de cette planette");
			bw.newLine();
			
			bw.close();
			ecrire.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
