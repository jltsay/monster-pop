package com.jtsay.monsterpop.grid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.jtsay.monsterpop.gameobjects.GameObject;


/**
 * The Grid is made up of 9 spaces. Spaces can either contain a GameObject (monster, item, etc) or be empty.
 * Empty spaces are kept track of.
 *
 * @author jltsay
 *
 */
public class Grid {

  public static Grid instance;
  ArrayList<Space> spaces;
  Set<Integer> emptyIndexes;
  Random rand;

  private Grid() {
    spaces = new ArrayList<Space>(9);
    emptyIndexes = new HashSet<Integer>(9);
    for (int i=0; i<9; i++) {
      spaces.add(new Space(i));
      emptyIndexes.add(i);
    }
  }

  public static Grid getInstance() {
    if (instance == null) {
      instance = new Grid();
    }
    return instance;
  }

  public void update(float delta) {
    for (Space space : spaces) {
      space.update(delta);
    }
  }

  public Space getRandomEmptySpace() {
    int setIndex = 0;
    int randIndex = rand.nextInt(emptyIndexes.size());
    for (Integer emptyIndex : emptyIndexes) {
      if (setIndex == randIndex) {
        return spaces.get(emptyIndex);
      }
      setIndex++;
    }
    return null;
  }

  public void addObjectAtEmptySpace(GameObject obj) {
    addObjectAtSpace(obj, getRandomEmptySpace());
  }

  public void addObjectAtSpace(GameObject obj, Space space) {
    if (space == null) return;
    assert space.isEmpty();
    space.setObject(obj);
    emptyIndexes.remove(space.gridIndex);
  }

  public void removeObjectAtSpace(int index) {
    spaces.get(index).removeObject();
    emptyIndexes.add(index);
  }


}
