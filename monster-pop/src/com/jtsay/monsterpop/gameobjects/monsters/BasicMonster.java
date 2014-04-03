package com.jtsay.monsterpop.gameobjects.monsters;

import com.jtsay.monsterpop.gameobjects.GameObject;

public class BasicMonster extends Monster {
	
	public static float LIFETIME = 5;
	private MonsterState state;

	public BasicMonster() {
		super(LIFETIME);
		state = MonsterState.ACTIVE;
	}

	@Override
	public GameObject create() {
		return new BasicMonster();
	}
	
	public void update(float delta) {
		if (state == MonsterState.ACTIVE) {
			timeLeft -= delta;
			if (timeLeft <= 0) {
				// TODO: lower player HP.
				state = MonsterState.POPPED;
				timeLeft = POP_TIME;
			}
		}
		if (state == MonsterState.POPPED) {
			// TODO: render popping animation. Probably can do this by using timeLeft to retrieve the keyframe.
			timeLeft-= delta;
			if (timeLeft <= 0) {
				removeFromGrid();
			}
		}
	}
	
	public void touch() {
		if (state == MonsterState.ACTIVE) {
			state = MonsterState.POPPED;
			timeLeft = POP_TIME;
		}
	}

}
