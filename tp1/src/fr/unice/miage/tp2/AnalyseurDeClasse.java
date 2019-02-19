package fr.unice.miage.tp2;
import java.lang.reflect.*;
import java.io.*;

public class AnalyseurDeClasse {
	
	

	public static void analyseClasse(String nomClasse) throws ClassNotFoundException {
		// Récupération d'un objet de type Class correspondant au nom passé en paramètres
		
		
		Class cl =  Class.forName(nomClasse);
		
		afficheEnTeteClasse(cl);

		System.out.println();
		afficheAttributs(cl);

		System.out.println();
		afficheConstructeurs(cl);

		System.out.println();
		afficheMethodes(cl);

		// L'accolade fermante de fin de classe !
		System.out.println("}");
	}


	/** Retourne la classe dont le nom est passé en paramètre */
	public static Class getClasse(String nomClasse) throws ClassNotFoundException {
		Class cl =  Class.forName(nomClasse);
		return cl;
	}

	/** Cette méthode affiche par ex "public class Toto extends Tata implements Titi, Tutu {" */
	public static void afficheEnTeteClasse(Class cl) {
		//  Affichage du modifier et du nom de la classe
		// CODE A ECRIRE
		
		System.out.print(cl.getName() );

		// Récupération de la superclasse si elle existe (null si cl est le type Object)
		Class supercl = cl.getSuperclass();
		if(supercl != null) {
			System.out.println( " extends "+  supercl.getName().toString());
			System.out.println( " implements "+  supercl.getInterfaces().getClass());
		}
		
		
				// On ecrit le "extends " que si la superclasse est non nulle et
				// différente de Object
				// CODE A ECRIRE

				// Affichage des interfaces que la classe implemente
				// CODE A ECRIRE

				// Enfin, l'accolade ouvrante !
				System.out.print(" {\n");
	}

	public static void afficheAttributs(Class cl) {
		// CODE A ECRIRE
	}

	public static void afficheConstructeurs(Class cl) {
		// CODE A ECRIRE
		System.out.println("{}");

	}


public static void afficheMethodes(Class cl) {
	// CODE A ECRIRE
	System.out.println("{}");
}


public static String litChaineAuClavier() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	return br.readLine();
}

public static void main(String[] args) {
	boolean ok = false;

	while(!ok) {
		try {
			System.out.print("Entrez le nom d'une classe (ex : java.util.Date): ");
			String nomClasse = litChaineAuClavier();

			analyseClasse(nomClasse);

			ok = true;
		} catch(ClassNotFoundException e) {
			System.out.println("Classe non trouvée.");
		}catch(IOException e) {
			System.out.println("Erreur d'E/S!");
		}
	}
}
}