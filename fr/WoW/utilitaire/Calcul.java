package fr.WoW.utilitaire;

import java.util.Random;

public class Calcul {
	
	/**
	 * FONCTION CHOIX COMBATTANT
	 * @param fighters
	 * @return
	 */	
	public static int chooseFighter(int nbFighters) {
		
		Random rand = new Random();
		return rand.nextInt(nbFighters);
		
	}
	
}
