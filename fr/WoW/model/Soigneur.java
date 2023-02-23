package fr.WoW.model;

public class Soigneur extends Personnage implements Healer {

	//CONSTRUCTEURS
	public Soigneur (String race, String name) {
		this(race, name, 850, 600);
	}
	
	public Soigneur(String race, String name, int HP, int MP) {
		super(race, name, HP, MP);
	}
	
	// calcul des points de soin fait sur soi-même
	@Override
	public void heal(int restore) {
		this.setHP(this.getHP() + restore);
	}

	// définition du cri de guerre
	@Override
	public String battleCry() {
		return "Je viens te sauver !";
	}

}
