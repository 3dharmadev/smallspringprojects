package Q1;

import Q2.GameIntr;

public class GameRunner {

	private GameIntr game;

	public GameRunner(GameIntr game){
		this.game=game;
	}



	public void run(){
		System.out.println("Game is started");

		game.up();
		game.down();
		game.left();
		game.right();
	}

}
