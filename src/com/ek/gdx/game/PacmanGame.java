package com.ek.gdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PacmanGame extends Game {
	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new GameScreen(this));

	}

	/*@Override
    public void render(float delta) {
        SpriteBatch batch = pacmanGame.batch;
        batch.begin();
        batch.draw(pacmanImg, 100, 100);
        batch.end();
    }*/
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}


