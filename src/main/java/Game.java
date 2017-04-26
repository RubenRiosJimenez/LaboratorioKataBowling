
public class Game {

	private int add=0;
	
	public void roll(int num_pins) {
		add= add+num_pins;
		
	}

	public int score() {
		
		return add;
	}
	
}
