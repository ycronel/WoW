package fr.WoW.domain;

import fr.WoW.model.*;
import fr.WoW.utilitaire.Calcul;

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
		while ( idFirstFighter == idSecFighter) {
			idSecFighter = Calcul.chooseFighter(fighters.length);
		}
		
		// LES COMBATTANTS SONT CHOISIS
		Personnage firstFighter = fighters[idFirstFighter];
		Personnage secFighter = fighters[idSecFighter];
		
		//fight(firstFighter, secFighter);
		
		System.out.println(firstFighter.getClass().getSimpleName());
		System.out.println(firstFighter.getName());
	}
		
	/**
	 * FONCTION COMBATS
	 * @param firstFighter
	 * @param secFighter
	 */
	public static void fight(Personnage firstFighter, Personnage secFighter) {
	

		// TANT QUE LES POINTS DE VIE DE CHAQUE COMBATTANT EST SUPÉRIEUR À 0
		int tour = 1;
		while (firstFighter.getHP() > 0 && secFighter.getHP() > 0) {
			// si nombre de tours impair, le premier combattant joue
			if (tour % 2 == 1) {
				play(firstFighter);
				
			} else {
				// sinon c'est le second combattant qui joue
				play(secFighter);
			}

			
			
			
			
			tour++;
		}
				
	}
	
	public static void play(Personnage p, Personnage adversaire) {
		
		switch (p.getClass().getSimpleName()) {
		case "Guerrier" :
			p.attack(adversaire, 300);
			break;
		case "Mage":
			
			break;
		case "Soigneur":
			
			break;
		}
		
	}
	


	

}
