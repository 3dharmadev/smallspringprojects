package Q2;

public class GameRunner {

	private SuperContaGame game;

	public GameRunner(SuperContaGame game){
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
