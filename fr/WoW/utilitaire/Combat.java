package fr.WoW.utilitaire;

import fr.WoW.model.*;
import fr.WoW.exception.*;


public class Combat {

	/**
	 * FONCTION COMBATS
	 * @param firstFighter
	 * @param secFighter
	 */
	public static void fight(Personnage firstFighter, Personnage secFighter) {
		//ETAT DES LIEUX DU JEU
		System.out.println("Start game");
		System.out.println(firstFighter.getName() + "(" + firstFighter.getHP()+ " PV)" + " VS " + secFighter.getName() + "(" + secFighter.getHP() + " PV)." );
		System.out.println(firstFighter.getName() + " : " + firstFighter.battleCry());
		System.out.println(secFighter.getName() + " : " + secFighter.battleCry() + "\n");
		
		
		// TANT QUE LES POINTS DE VIE DE CHAQUE COMBATTANT EST SUPÉRIEUR À 0
		int tour = 1;
		while (firstFighter.getHP() > 0 && secFighter.getHP() > 0) {
			System.out.println("Tour " + tour + " : ");
			// si nombre de tours impair, le premier combattant joue
			if (tour % 2 == 1) {
				play(firstFighter, secFighter);
			} else {
				// sinon c'est le second combattant qui joue
				play(secFighter, firstFighter);
			}
			
			System.out.println(firstFighter.getName() + " a " + firstFighter.getHP() + " PV."); 
			System.out.println(secFighter.getName() + " a " + secFighter.getHP() + " PV. \n"); 
			
			tour++;
		}	
		// FIN DU COMBAT
		if (firstFighter.getHP() == 0) {
			System.out.println(firstFighter.getName() + " a perdu... ");
			System.out.println(secFighter.getName() + " remporte le combat ! ");
		} else {
			System.out.println(secFighter.getName() + " a perdu... ");
			System.out.println(firstFighter.getName() + " remporte le combat ! ");
		}
	}
	
	/**
	 * FONCTION POUR ACTUALISER LES POINTS DE VIE SUR UN TOUR
	 * @param p
	 * @param adversaire
	 */
	public static void play(Personnage p, Personnage adversaire) {
		
		switch (p.getClass().getSimpleName()) {
		case "Guerrier" :
			try {
				((Guerrier) p).attack(adversaire, 300);
				System.out.println("Le guerrier " + p.getName() + " attaque " + adversaire.getName() + ".");
			} catch(ZeroHPException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case "Mage":
			try {
				((Mage) p).attack(adversaire, 250);
			} catch (ZeroHPException e) {
				System.out.println(e.getMessage());
			}
			
			((Mage) p).heal(150);
			System.out.println("Le mage " + p.getName() + " attaque " + adversaire.getName() + " et se soigne.");
			break;
			
		case "Soigneur":
			((Soigneur) p).heal(200);
			System.out.println("Le soigneur " + p.getName() + " se soigne.");
			break;
			
		default:
			break;
		}	
	}
	
	
}
