import java.awt.Frame;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class Game {
	private static final int FRAMES_PER_GAME = 10;
    private List<Frame> frames = new LinkedList<Frame>();
	private int add=0;
	
	public void roll(int num_pins) {
		add= add+num_pins;
		
	}

	public int score() {
		
		return add;
	}
	void addFrame(Frame ceroFrame) {
        frames.add(ceroFrame);
    }

	public void addFrame(Game ceroFrame) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
