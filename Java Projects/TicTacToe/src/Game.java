import javax.swing.*;

public class Game
{
    static JTextArea jTextArea = new JTextArea();
    static char[][]Grid = new char[3][3];

    public static void CreateEmptyGrid() {
        StringBuilder txt = new StringBuilder();
        for(int row=0;row<3;row++) {
            for(int col=0;col<3;col++) {
                Grid[row][col]='_';
                txt.append(Grid[row][col]).append("                                                       "); }
            txt.append("\n").append("\n"); }
        jTextArea.setText(txt.toString());
        JOptionPane.showMessageDialog(null, txt.toString(), "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); }

    public static void UpdateGrid() {
        StringBuilder txt = new StringBuilder();
        for(int row=0;row<3;row++) {
            for(int col=0;col<3;col++) {
                txt.append(Grid[row][col]).append("                                                       "); }
            txt.append("\n").append("\n"); }
        jTextArea.setText(txt.toString());
        JOptionPane.showMessageDialog(null, txt.toString(), "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); }

    public static void CheckIfBoardFull() {
        boolean isFull=true;
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++)
            {
                if (Grid[row][col] == '_') {
                    isFull = false;
                    break;
                }
            }
        }
        if(isFull){JOptionPane.showMessageDialog(null, "Draw!",
                "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "Play Again?", "Tic Tac Toe",
                    JOptionPane.YES_NO_OPTION);
            if(input==JOptionPane.NO_OPTION){System.exit(0);}
            else{ CreateEmptyGrid(); }
        }
    }
    public static Boolean PlayerOneWon() {
        Boolean Diagonal = Grid[0][0] == 'X' && Grid[1][1] == 'X' && Grid[2][2] == 'X' ||
                Grid[2][0] == 'X' && Grid[1][1] == 'X' && Grid[0][2] == 'X';
        Boolean Horizontal = Grid[0][0] == 'X' && Grid[0][1] == 'X' && Grid[0][2] == 'X' ||
                Grid[1][0] == 'X' && Grid[1][1] == 'X' && Grid[1][2] == 'X' || Grid[2][0] == 'X' && Grid[2][1] == 'X' && Grid[2][2] == 'X';
        Boolean Verticle = Grid[0][0] == 'X' && Grid[1][0] == 'X' && Grid[2][0] == 'X' ||
                Grid[0][1] == 'X' && Grid[1][1] == 'X' && Grid[2][1] == 'X' || Grid[0][2] == 'X' && Grid[1][2] == 'X' && Grid[2][2] == 'X';
        return Diagonal || Horizontal || Verticle;
    }

    public static Boolean PlayerTwoWon() {
        Boolean Diagonal = Grid[0][0] == 'O' && Grid[1][1] == 'O' && Grid[2][2] == 'O' ||
                Grid[2][0] == 'O' && Grid[1][1] == 'O' && Grid[0][2] == 'O';
        Boolean Horizontal = Grid[0][0] == 'O' && Grid[0][1] == 'O' && Grid[0][2] == 'O' ||
                Grid[1][0] == 'O' && Grid[1][1] == 'O' && Grid[1][2] == 'O' || Grid[2][0] == 'O' && Grid[2][1] == 'O' && Grid[2][2] == 'O';
        Boolean Verticle = Grid[0][0] == 'O' && Grid[1][0] == 'O' && Grid[2][0] == '0' ||
                Grid[0][1] == 'O' && Grid[1][1] == 'O' && Grid[2][1] == 'O' || Grid[0][2] == 'O' && Grid[1][2] == 'O' && Grid[2][2] == 'O';
        return Diagonal || Horizontal || Verticle;
    }


    public static void CheckForWinner()
    {
        boolean Winner = false;
        if(PlayerOneWon())
        {
            JOptionPane.showMessageDialog(null, "Player One Won",
                    "WINNER!",JOptionPane.INFORMATION_MESSAGE); Winner=true;
        }
        else if(PlayerTwoWon())
        {
            JOptionPane.showMessageDialog(null, "Player Two Won!",
                    "WINNER!",JOptionPane.INFORMATION_MESSAGE);Winner=true;
        }
            if(Winner){
                int input = JOptionPane.showConfirmDialog(null, "Play Again?", "Tic Tac Toe",
                        JOptionPane.YES_NO_OPTION);
                if(input==JOptionPane.NO_OPTION){System.exit(0);}
                else{ CreateEmptyGrid(); }

            }


    }



}
