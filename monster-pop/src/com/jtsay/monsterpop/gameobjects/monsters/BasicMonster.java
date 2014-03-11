package com.jtsay.monsterpop.gameobjects.monsters;

import com.jtsay.monsterpop.gameobjects.GameObject;

public class BasicMonster extends Monster {
	
	public static float lifetime = 5;

	public BasicMonster() {
		super(lifetime);
	}

	@Override
	public GameObject create() {
		return new BasicMonster();
	}
	
	public void update(float delta) {
		
	}

}
