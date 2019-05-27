package game;

import lexicon.LexiconInterface;

public class HangmanGame implements HangmanGameInterface {

	public HangmanGame(LexiconInterface l) {
		
	}	

	@Override
	public boolean guess(char letter) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPartlyGuessedWord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHangmanWord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGuessedLetters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isGameLost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGameWon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getGuessesLeft() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIncorrectGuesses() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCorrectGuesses() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
