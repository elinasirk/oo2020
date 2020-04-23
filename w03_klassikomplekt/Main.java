public class Main {
    public static void main(String[] args) {
        
        Apples store = new Apples();

        Apple bought1 = new Apple(20, 14);
        Apple bought2 = new Apple(14, 14);
        Apple bought3 = new Apple(14, 5);

        store.addPurchase(bought1);
        store.addPurchase(bought2);
        store.addPurchase(bought3);
        store.list();

        System.out.println();
        
        }
}