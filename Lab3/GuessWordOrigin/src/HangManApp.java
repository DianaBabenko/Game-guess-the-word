import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.HangmanGame;
import game.HangmanGameInterface;
import lexicon.HangmanLexicon;

public class HangManApp {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	private HangmanGameInterface hangmanGame;
	private HangmanLexicon hangmanLexicon;

	public void setup() {
		hangmanLexicon = new HangmanLexicon();
		hangmanGame = new HangmanGame(hangmanLexicon);
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public static void main(String[] args) {

	}

}
