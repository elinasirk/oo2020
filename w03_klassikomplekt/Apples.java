import java.util.ArrayList;
import java.util.List;

public class Apples{

    private final List<Apple> store = new ArrayList<>();

    public void addPurchase(Apple apple) {
        store.add(apple);
    }

    public void removePurchase(int index) {
        store.remove(index);
    }

    public void list() {
        for (int i = 0; i < store.size(); i++) {
            System.out.println("Ostetud õunad: " + store.get(i).getBought());
        }
    }

}
