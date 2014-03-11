package com.jtsay.monsterpop.gameobjects.factory;

import java.util.Random;

import com.jtsay.monsterpop.gameobjects.monsters.Monster;

public class MonsterFactory {

	Monster[] monsters;
	Random rand;
	
	public Monster createRandomMonster(int level) {
		return (Monster) monsters[rand.nextInt(level) % monsters.length].create();
	}
	
}
