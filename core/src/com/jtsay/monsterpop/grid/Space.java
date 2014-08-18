package com.jtsay.monsterpop.grid;

import com.jtsay.monsterpop.gameobjects.GameObject;


public class Space {

  public final int gridIndex;
  private GameObject gameObject;

  Space(int gridIndex) {
    this.gridIndex = gridIndex;
  }

  boolean isEmpty() {
    return gameObject == null && Grid.getInstance().emptyIndexes.contains(gridIndex);
  }

  GameObject getGridObject() {
    return gameObject;
  }

  void update(float delta) {
    if (gameObject != null) {
      gameObject.update(delta);
    }
  }

  void setObject(GameObject obj) {
    removeObject();
    gameObject = obj;
    gameObject.setSpace(this);
  }

  void removeObject() {
    if (isEmpty()) return;
    gameObject.setSpace(null);
    gameObject = null;
  }

}
