package com.jtsay.monsterpop.gameobjects.factory;

import java.util.Random;

import com.jtsay.monsterpop.gameobjects.monsters.BasicMonster;
import com.jtsay.monsterpop.gameobjects.monsters.Monster;

public class MonsterFactory {

  static Monster[] monsters = {new BasicMonster()};
  static Random rand;


  public static Monster createRandomMonster(int level) {
    return (Monster) monsters[rand.nextInt(level) % monsters.length].create();
  }

}