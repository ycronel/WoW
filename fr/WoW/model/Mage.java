package fr.WoW.model;

public class Mage extends Personnage implements Berserker, Healer{
	
	// CONSTRUCTEURS
	public Mage(String race, String name) {
		this(race, name, 1000, 500);
	}
	
	public Mage(String race, String name, int HP, int MP) {
		super(race, name, HP, MP);
	}
	
	// calcul des points de soin fait sur soi-même
	@Override
	public void heal(int restore) {
		this.setHP(this.getHP() + restore);
	}

	// calcul des points de dégat faits sur l'adversaire
	@Override
	public void attack(Personnage p, int damage) {
		p.setHP((p.getHP() - damage) <= 0 ? 0 : p.getHP() - damage);
		
	}
	
	// définition du cri de guerre
	@Override
	public String battleCry() {
		return "Avada Kedavra !";
	}

}
