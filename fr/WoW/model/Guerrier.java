package fr.WoW.model;

public class Guerrier extends Personnage implements Berserker {
	
	// CONSTRUCTEURS
	public Guerrier (String race, String name) {
		this(race, name, 1200, 400);
	}
	
	public Guerrier(String race, String name, int HP, int MP) {
		super(race, name, HP, MP);
	}
	
	// calcul des points de dégat faits sur l'adversaire
	@Override
	public void attack(Personnage p, int damage) {
		p.setHP((p.getHP() - damage) <= 0 ? 0 : p.getHP() - damage);
	}
	
	// définition du cri de guerre
	@Override
	public String battleCry() {
		return "Je vais te défoncer ! ";
	}
	
	

}
