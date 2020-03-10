import java.util.Arrays;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) 
	{
		Hangman hangman = new Hangman();
		try {
			GameInAction(hangman);

		}
		catch(Exception e) 
		{
		    JOptionPane.showMessageDialog(null, "Invalid Input");
		}
	}
	
	public static void GameInAction(Hangman hangman) 
	{
		int TotalGuesses=0;
		boolean AllGuessesCorrect = hangman.WordSpaces==hangman.WordToBeGuessed;

		while(TotalGuesses< 6 )
		{
			hangman.GuessedCharacter();
			hangman.AllCorrect();
			hangman.ReplaceSpacesIfCorrect();
			if(hangman.GuessIsCorrect())
			{
			    JOptionPane.showMessageDialog(null, "Correct Guess");
			}
			else 
			{
				TotalGuesses++;
				JOptionPane.showMessageDialog(null, "Incorrect Guess");

			}
			if(TotalGuesses==6)
			{
				JOptionPane.showMessageDialog(null, "No more Guesses Left, "
						+ "Here is the Correct Word:");
				JOptionPane.showMessageDialog(null, Arrays.toString(hangman.WordToBeGuessed));

			}
			
			
			if(hangman.AllCorrect()==7)
			{
				JOptionPane.showMessageDialog(null, "All Correct, Winner!");

				break;
			}
			
		}
		
	}

}
