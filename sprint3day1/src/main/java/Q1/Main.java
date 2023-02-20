package Q1;

import Q2.GameIntr;
import Q2.PacManGame;
import Q2.SuperContaGame;

public class Main {
	
	
	public static void main(String[] args) {

		GameIntr game=new PacManGame();
		 GameRunner runner=new GameRunner(game);
		runner.run();
	}

}
