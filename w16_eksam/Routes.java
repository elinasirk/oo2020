import java.util.ArrayList;
import java.util.List;



public class Routes {

    private final List<Route> info = new ArrayList<>();

    public void addRoute(Route route) {
        info.add(route);
    }

    public void lengths() {
        for (int i = 0; i < info.size(); i++) {
            System.out.println(i + 1 + ". marsruut: Rong sõitis " + info.get(i).getLength() + " kilomeetrit.");
        }
    }

    public void trainStops(){
        for (int i = 0; i < info.size(); i++) {
            System.out.println(i + 1 + ". rong: Rong tegi " + info.get(i).getStops() + " peatust.");
        }

    }

}