package com.ek.gdx.game;

public class World {
	
	 private Pacman pacman;
	    World(PacmanGame pacmanGame) {
	        pacman = new Pacman(100,100);
	    }
	 
	    Pacman getPacman() {
	        return pacman;
	    }

}
