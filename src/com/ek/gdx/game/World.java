package com.ek.gdx.game;

public class World {
	
	 private Pacman pacman;
	 private Maze maze;
	 private PacmanGame pacmanGame;
	 private int score;
	 
	    World(PacmanGame pacmanGame) {
	    	maze = new Maze();
	        pacman = new Pacman(60,60,this);
	        this.pacmanGame = pacmanGame;
	        score = 0;
	        registerDotEattenListener();
	    }
	    
	    private void registerDotEattenListener() {
	        pacman.registerDotEattenListener(new Pacman.DotEattenListener() {
	            @Override
	            public void notifyDotEatten() {
	                score += 1;
	            }
	        });
	    }
	    Pacman getPacman() {
	        return pacman;
	    }
	    Maze getMaze() {
	        return maze;
	    }
	    public void update(float delta) {
	        pacman.update();
	    }
	    public int getScore() {
	        return score;
	    }
	    public void increaseScore() {
	        score += 1;
	    }
	    
	    

}
