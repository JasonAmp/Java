import javax.swing.*;

public class TicTacToe extends Game
{
    public static void main (String[] args)
    {
        CreateEmptyGrid();
        while(true)
        {
            try{
                Player.PlayerOneTurn();
                PlayerTwo.PlayerTwoTurn();
            }
            catch (Exception e)
            {
            JOptionPane.showMessageDialog(null, "Please enter in proper format.(ex. 0,1) and within bounds.",
                    "Invalid Input",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}
