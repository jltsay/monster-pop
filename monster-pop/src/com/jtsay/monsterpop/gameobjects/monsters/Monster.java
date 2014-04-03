package com.jtsay.monsterpop.gameobjects.monsters;

import com.jtsay.monsterpop.gameobjects.GameObject;

public abstract class Monster extends GameObject {
	
	static final float POP_TIME = 1;
	int currentHealth;
	int maxHealth;
	float timeLeft;

	public Monster(float lifetime) {
		super();
		timeLeft = lifetime;
	}

}
