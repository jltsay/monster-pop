package com.jtsay.monsterpop.gameobjects;

import com.badlogic.gdx.math.Vector2;
import com.jtsay.monsterpop.grid.Grid;
import com.jtsay.monsterpop.grid.Space;

public abstract class GameObject {

  Space space;

  public GameObject() {
    this.space = null;
  }

  public abstract GameObject create();

  public Vector2 getPosition() {
    // TODO: return a position vector given this object's grid index.
    return null;
  }

  public abstract void update(float delta);

  public void setSpace(Space space) {
    this.space = space;
  }

  public void removeFromGrid() {
    Grid.getInstance().removeObjectAtSpace(space.gridIndex);
  }

  public abstract void touch();

}