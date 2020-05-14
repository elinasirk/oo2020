import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    public int winner(){
        char Winner = ' ';
        int temp = 0;
        char board[] = new char[10];

        private final ArrayList<Integer> playerPositionsX = new ArrayList<Integer>();
        private final ArrayList<Integer> playerPositionsO = new ArrayList<Integer>();

        for (int i = 0; i <= board.length; i++) {
            if(i % 2 == 0){
                Scanner turn = new Scanner(System.in);
                System.out.println("X mängija kord, vali positsioon 1 - 9");
                int place = turn.nextInt();

                if(playerPositionsX.contains(place)){
                    System.out.println("Oled sinna juba käinud, vali uus");
                    int place2 = turn.nextInt();
                    playerPositionsX.add(place2);
                }

                if(playerPositionsO.contains(place)){
                    System.out.println("See koht on su vastase käes, vali uus");
                    int place3 = turn.nextInt();
                    playerPositionsX.add(place3);
                }

                else {
                    playerPositionsX.add(place);
                }


            }

            if(i % 2 != 0){
                Scanner turn = new Scanner(System.in);
                System.out.println("O mängija kord, vali positsioon 1 - 9");
                int place = turn.nextInt();

                if(playerPositionsO.contains(place)){
                    System.out.println("Oled sinna juba käinud, vali uus");
                    int place2 = turn.nextInt();
                    playerPositionsO.add(place2);
                }

                if(playerPositionsX.contains(place)){
                    System.out.println("See koht on su vastase käes, vali uus");
                    int place3 = turn.nextInt();
                    playerPositionsO.add(place3);
                }

                else {
                    playerPositionsO.add(place);
                }

                if(playerPositionsX.contains((1 & 2 & 3) | (4 & 5 & 6) | (7 & 8 & 9) | (1 & 4 & 7) | (2 & 5 & 8)
                | (3 & 6 & 9) | (1 & 5 & 9) | (3 & 5 & 7))){
                    System.out.println("Mängija X võitis");
                }

                if(playerPositionsO.contains((1 & 2 & 3) | (4 & 5 & 6) | (7 & 8 & 9) | (1 & 4 & 7) | (2 & 5 & 8)
                | (3 & 6 & 9) | (1 & 5 & 9) | (3 & 5 & 7))){
                    System.out.println("Mängija O võitis");
                }

            }
        }

    }
}