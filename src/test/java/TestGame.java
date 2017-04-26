import static org.junit.Assert.*;

import org.junit.Test;

public class TestGame {
	
	private Game game = new Game();
	
	@Test
	public void roll3And5() {
		
		int score;
		game.roll(3);
		game.roll(5);
		
		score=game.score();
		
		assertEquals(8, score);
	}
	@Test
	public void roll7andtwoResult17(){
		
		int score;
		game.roll(3);
		game.roll(5);
		game.roll(7);
		game.roll(2);
		
		score=game.score();
		
		assertEquals(17, score);
	}
	
	@Test
	public void roll0andResult17(){
		int score;
		game.roll(0);
		game.roll(3);
		game.roll(5);
		game.roll(7);
		game.roll(2);
		
		score=game.score();
		
		assertEquals(17, score);
	}

}
