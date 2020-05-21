import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Routes info = new Routes();

        Route route1 = new Route(2, 7, 14, 15, 3);
        Route route2 = new Route(2, 7, 2, 7, 0);
        Route route3 = new Route(4, 8, 0, 2, 1);
        Route route4 = new Route(6, 9, 10, 15, 2);
        Route route5 = new Route(28, 75, 83, 77, 11);

        info.addRoute(route1);
        info.addRoute(route2);
        info.addRoute(route3);
        info.addRoute(route4);
        info.addRoute(route5);
        
        System.out.println("Teepikkused:");
        info.lengths();
        System.out.println();
        System.out.println("Peatuste arv:");
        info.trainStops();


        System.out.println();
        System.out.println("Mitme peatusega rongi soovid?");
        int wanted = input.nextInt();
        int wantedStops = 0;
        if(wanted >= 0){
            wantedStops = wanted;
        }
        if(wanted < 0){
            System.out.println("Peatuste arv ei saa olla negatiivne.");
        }
        int temp = 0;
        if(wantedStops == 0){
            System.out.println("2. rong");
            temp += 1;
        }
        if(wantedStops == 1){
            System.out.println("3. rong");
            temp += 1;
        }
        if(wantedStops == 2){
            System.out.println("4. rong");
            temp += 1;
        }
        if(wantedStops == 3){
            System.out.println("1. rong");
            temp += 1;
        }
        if(wantedStops == 11){
            System.out.println("5. rong");
            temp += 1;
        }
        if(temp < 1){
            System.out.println("Sellise arvu peatustega rongid puuduvad.");
        }

            
        
        
    }
}