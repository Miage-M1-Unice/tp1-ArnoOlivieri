package fr.unice.miage.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class ListeRep_1a1 {


	
	private File fichier;
	

	public ListeRep_1a1() {
		
		this.fichier = new File(".");
		
	}
	
	public void listerSimple() {
		String[] liste = fichier.list();
		for(String path : liste) {
			System.out.println(path);
		}
	}
	
	public void listerAvancee(File fichier) {
		File[] liste = fichier.listFiles();
		for(File path : liste) {
			
			if(path.isDirectory()) {
				System.out.println(path);
				listerAvancee(path);
			
		}else {
			System.out.println(path);
		}
		}
	}
	
	public void listerAvancee(File fichier, FilenameFilter filtre) {
		File[] liste = fichier.listFiles();
		for(File path : liste) {
			
			if(path.isDirectory()) {
				System.out.println(path);
				listerAvancee(path);
			
		}else {
			System.out.println(path);
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeRep_1a1 liste = new ListeRep_1a1();
		//liste.listerSimple();
		liste.listerAvancee(liste.fichier);
		
		//FilenameFilter filtre;
		//filtre.paramString("ok");
		//liste.listerAvancee(liste.fichier,filtre);
		
		
	}
}
