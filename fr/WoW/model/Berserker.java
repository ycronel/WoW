package fr.WoW.model;

import fr.WoW.exception.ZeroHPException;

public interface Berserker {

	void attack(Personnage p, int damage) throws ZeroHPException;
}
