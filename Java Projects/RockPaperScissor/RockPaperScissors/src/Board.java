import java.util.Arrays;

import javax.swing.JOptionPane;

public class Board {

	Character[][] Grid;
	int rows=3;
	int columns=3;
	public Board() 
	{
		
		String [][] Grid = new String [rows][columns];
	}
	
	public void DrawBoard() 
	{
		int rows = 3;
		int columns = 3;

		String[][] Grid = new String[rows][columns];

		for(int i = 0; i<rows; i++)
		    for(int j = 0; j<columns; j++)
		    	Grid[i][j] = "_"+" ";
    			Grid[0][0]="x"+" ";
    			Grid[1][1]="x"+" ";
    			Grid[2][2]="x"+" ";




		for(int i = 0; i<rows; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(Grid[i][j]);
		    }
		    System.out.println();
		}
	

	}
	
	
	
	public void FillSpot()
	{
		Grid[0][0]='x';
	}
	
	

}
