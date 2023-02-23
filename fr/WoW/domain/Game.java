package fr.WoW.domain;

import fr.WoW.model.*;
import fr.WoW.utilitaire.*;

public class Game {

	public static void main(String[] args) {
		
		Personnage[] fighters = new Personnage[5];
		
		//CREATION DE 5 PERSONNAGES
		fighters[0] = new Guerrier("humaine", "Xena");
		fighters[1] = new Mage("humaine", "Merlin");
		fighters[2] = new Soigneur("ninja", "Sakura");
		fighters[3] = new Guerrier("saiyan", "Son Goku");
		fighters[4] = new Mage("sorcier", "Harry Potter");
		
		// CHOISIR LES COMBATTANTS
		int idFirstFighter = Calcul.chooseFighter(fighters.length);
		int idSecFighter = Calcul.chooseFighter(fighters.length);
		
		// TANT QUE COMBATTANT 2 = COMBATTANT 1, ON CHERCHE UN AUTRE COMBATTANT 2
		while ((idFirstFighter == idSecFighter) || 
				(fighters[idFirstFighter].getClass().getSimpleName() == "Soigneur" 
				&& fighters[idSecFighter].getClass().getSimpleName() == "Soigneur")) {
			idSecFighter = Calcul.chooseFighter(fighters.length);
		}
		
		// LES COMBATTANTS SONT CHOISIS
		Personnage firstFighter = fighters[idFirstFighter];
		Personnage secFighter = fighters[idSecFighter];
		
		Combat.fight(firstFighter, secFighter);
		
		
	}
		



	

}
