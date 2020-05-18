package app;

public class Game implements Piece {

    private char board[]=new char[10];
    private char player;
    public int Turns=1;


    
    @Override
    public void start(char symbol) {
        char position[] = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i;
        player = symbol;
        for (i=1; i<10; i++){
            board[i]=position[i];
        }
    }

    @Override
    public void getTurn() {
        Turns++;
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

    @Override
    public void place(char symbol, int pos) {
        board[pos] = symbol;
    }

    @Override
    public boolean checkPlacement(int pos) {
        if (board[pos] == 'X' || board[pos] == 'O')
        {
            System.out.println("See koht on juba võetud");
            return true;
        }
        else {
            return false;
        }
    }

    public void PrintBoard() {
        System.out.println();
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println();
    }

    public  char getPlayer() {
        return player;
    }

    public int winner(){
        char Winner = ' ';
        int win = 0;

        if (board[1] == 'X' && board[2] == 'X' && board[3] == 'X') Winner = 'X';
        if (board[4] == 'X' && board[5] == 'X' && board[6] == 'X') Winner = 'X';
        if (board[7] == 'X' && board[8] == 'X' && board[9] == 'X') Winner = 'X';
        if (board[1] == 'X' && board[4] == 'X' && board[7] == 'X') Winner = 'X';
        if (board[2] == 'X' && board[5] == 'X' && board[8] == 'X') Winner = 'X';
        if (board[3] == 'X' && board[6] == 'X' && board[9] == 'X') Winner = 'X';
        if (board[1] == 'X' && board[5] == 'X' && board[9] == 'X') Winner = 'X';
        if (board[3] == 'X' && board[5] == 'X' && board[7] == 'X') Winner = 'X';
        if (Winner == 'X' ) {
            System.out.println("X võitis!" );
            win = 1;
        }

        if (board[1] == 'O' && board[2] == 'O' && board[3] == 'O') Winner = 'O';
        if (board[4] == 'O' && board[5] == 'O' && board[6] == 'O') Winner = 'O';
        if (board[7] == 'O' && board[8] == 'O' && board[9] == 'O') Winner = 'O';
        if (board[1] == 'O' && board[4] == 'O' && board[7] == 'O') Winner = 'O';
        if (board[2] == 'O' && board[5] == 'O' && board[8] == 'O') Winner = 'O';
        if (board[3] == 'O' && board[6] == 'O' && board[9] == 'O') Winner = 'O';
        if (board[1] == 'O' && board[5] == 'O' && board[9] == 'O') Winner = 'O';
        if (board[3] == 'O' && board[5] == 'O' && board[7] == 'O') Winner = 'O';
        if (Winner == 'O' ) {
            System.out.println( "O Võitis!" );
            win = 1;
        }

        return win;
    }

    public int tie(){

        int tie = 0;
        if (Turns==9) {
            System.out.println("Kõik kohad on võetud, jäite viiki.");
            tie = 1;
        }
        return tie;
    }

}