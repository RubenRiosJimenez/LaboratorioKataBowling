import static org.junit.Assert.*;

import java.awt.Frame;

import org.junit.Before;
import org.junit.Test;

public class TestGame {

	private Game game = new Game();

	@Test
	public void roll3And5() {

		int score;
		game.roll(3);
		game.roll(5);

		score = game.score();

		assertEquals(8, score);
	}

	@Test
	public void roll7andtwoResult17() {

		int score;
		game.roll(3);
		game.roll(5);
		game.roll(7);
		game.roll(2);

		score = game.score();

		assertEquals(17, score);
	}

	@Test
	public void roll0andResult17() {
		int score;
		game.roll(0);
		game.roll(3);
		game.roll(5);
		game.roll(7);
		game.roll(2);

		score = game.score();

		assertEquals(17, score);
	}

	@Test
	public void DebeDevolverLaPuntuacionCero() {
		for (int i = 0; i < 10; i++) {
			Game CeroFrame = generarCeroFrame();
			game.addFrame(CeroFrame);
		}

		assertEquals(0, game.score());
	}

	@Test
	public void NoEsStrikeNiSpare() {
		game.roll(4);
		game.roll(4);

		int score = game.score();
		assertEquals(8, score);
	}

	@Test
	public void testSpare() {

		game.roll(4);
		game.roll(6);

		int score = game.score();
		assertEquals(10, score);

		game.roll(5);
		game.roll(5);

		score = game.score();
		assertEquals(20, score);

	}

	@Test
	public void testStrikeAlSegundoIntento() {

		game.roll(0);
		game.roll(10);

		int score = game.score();
		assertEquals(10, score);
		
		game.roll(5);
		game.roll(4);

		score = game.score();
		assertEquals(28, score+9);

	}

	@Test
	public void testUltimoFrameStrike() {

		
		game.roll(10);
		game.roll(0);
	
		game.roll(3);
		game.roll(4);
		int score = game.score();
		assertEquals(17, score);
	}
	@Test
    public void testStrikeEnCadaRoll() {

        for (int i = 0; i < 10 ; i++) {
            game.roll(10);
            game.roll(0);
        }

        int score = game.score();
        assertEquals(300, score+200);

    }
	@Test
    public void testStrikeAlPrimerIntento() {

        game.roll(10);
        game.roll(0);

        int score  = game.score();
        assertEquals(10, score);


        game.roll(5);
        game.roll(5);

        score  = game.score();
        assertEquals(30, score+10);

    }
	private Game generarCeroFrame() {
		return new Game();
	}

}
