package com.jtsay.monsterpop.gameobjects.monsters;

import com.jtsay.monsterpop.gameobjects.GameObject;

public abstract class Monster extends GameObject {
	
	int currentHealth;
	int maxHealth;

	public Monster(float lifetime) {
		super(lifetime);
	}

}
