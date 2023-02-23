package fr.WoW.model;

public abstract class Personnage {
	
	//ATTRIBUTS
	private String race, name;
	private int HP, MP;
	
	//CONSTRUCTEURS
	public Personnage(String race, String name) {
		this(race, name, 1000, 500);
	}

	public Personnage(String race, String name, int hP, int mP) {
		this.race = race;
		this.name = name;
		this.HP = hP;
		this.MP = mP;
	}
	
	//GETTERS ET SETTERS
	public String getRace() {
		return this.race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHP() {
		return this.HP;
	}
	public void setHP(int hP) {
		this.HP = hP;
	}
	public int getMP() {
		return this.MP;
	}
	public void setMP(int mP) {
		this.MP = mP;
	}
	
	public abstract String battleCry();
	

	
}
