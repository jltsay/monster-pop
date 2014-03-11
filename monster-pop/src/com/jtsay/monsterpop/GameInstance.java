package com.jtsay.monsterpop;

public class GameInstance {

	public static GameInstance instance;
	Player player;
	int currentLevel;
	float timeLeft;
	GameState gameState;
	
	private GameInstance() {
		player = new Player();
		currentLevel = 0;
		timeLeft = 60;
		gameState = GameState.PAUSED;
	}
	
	public static GameInstance getInstance() {
		if (instance == null) {
			instance = new GameInstance();
		}
		return instance;
	}
	
	public void update(float delta) {
		if (gameState == GameState.RUNNING) {
			updateRunning(delta);
		} else if (gameState == GameState.PAUSED) {
			updatePaused(delta);
		}
	}
	
	private void updateRunning(float delta) {
		timeLeft -= delta;
		if (timeLeft <= 0) {
			gameState = GameState.PAUSED;
			currentLevel += 1;
		}
	}
	
	private void updatePaused(float delta) {
		
	}
	
	public void createRandomMonsterAtEmptySpace() {
		
	}
	
}
