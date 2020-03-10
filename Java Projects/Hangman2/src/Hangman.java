import java.util.Arrays;

import javax.swing.JOptionPane;

public class Hangman {
	
	public char[] WordToBeGuessed = {'h','e','l','l','o','w','o','r','l','d'};
	public char[]WordSpaces;
	public char[]AlreadyGuessed;

	public char GuessedChar;
	int CountWordChar=0;
	
	public Hangman() 
	{
		for(int index=0;index<WordToBeGuessed.length;index++)
		{
			CountWordChar ++;
		}
		WordSpaces = new char[CountWordChar];
		AlreadyGuessed = new char[CountWordChar];
	}
	public void GuessedCharacter() 
	{
		String guess = JOptionPane.showInputDialog("Guess Character");
		GuessedChar = guess.charAt(0);
		AllCorrect();

	}
	
	public void DisplayEmptySpaces() 
	{
		for(int index=0;index<WordToBeGuessed.length;index++)
		{
			WordSpaces[index] = '_';
		}
	    JOptionPane.showMessageDialog(null, Arrays.toString(WordSpaces));

	}
	public boolean GuessIsCorrect() 
	{
		for(int index=0;index<WordToBeGuessed.length;index++)
		{
			if(WordToBeGuessed[index]==GuessedChar)
			{
				return true;
			}

		}
		return false;

	}
	public int AllCorrect() 
	{
		int AllCharactersCorrect=0;
		for(int index=0;index<WordToBeGuessed.length;index++)
		{
			if(WordToBeGuessed[index]==GuessedChar)
			{
				AllCharactersCorrect++;
			}
			
		}
		return AllCharactersCorrect;
	}
	public void ReplaceSpacesIfCorrect()
	{
		for(int index=0;index<WordToBeGuessed.length;index++)
		{
			for(int secondIndex=0;secondIndex<WordSpaces.length;secondIndex++)
			{
				if(WordToBeGuessed[index]==GuessedChar)
				{
					WordSpaces[index] = GuessedChar;
					AlreadyGuessed[index] = WordSpaces[index];
				}
			}
			
		}
	    JOptionPane.showMessageDialog(null, Arrays.toString(WordSpaces));
	    
	

	}
	
	
	


}
