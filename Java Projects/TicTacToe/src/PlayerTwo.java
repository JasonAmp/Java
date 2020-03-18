import javax.swing.*;

public class PlayerTwo extends Game
{

    public static void PlayerTwoTurn() {
        String UserInput = JOptionPane.showInputDialog(null,
                "                                                       Board Spots"+"\n"+ "0,0                                                             0,1                                                                 0,2" +"\n"+"    "+"\n"+
                        "1,0,                                                            1,1,                                                                1,2" +"\n"+"    "+"\n"+
                        "2,0                                                             2,1                                                                 2,2",
                "Player Two's Turn (O)",JOptionPane.INFORMATION_MESSAGE);
        if(UserInput ==null){System.exit(0);}
        int RowIndex=Integer.parseInt(String.valueOf(UserInput.charAt(0)));
        int ColumnIndex=Integer.parseInt(String.valueOf(UserInput.charAt(2)));
        if(Grid[RowIndex][ColumnIndex]=='_') {
            for(int row=0;row<3;row++) {
                for(int col=0;col<3;col++) {
                    Grid[RowIndex][ColumnIndex]='O'; }
            }
            UpdateGrid();  CheckForWinner(); CheckIfBoardFull();
        }
        else {
            JOptionPane.showMessageDialog(null, "Spot Already Occupied",
                "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE); PlayerTwoTurn();
        }
    }








}
