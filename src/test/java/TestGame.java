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

}
