public class TreeTest {

    public static void main(String[] args) {
        Tree tree1 = new Tree(37, 1000, TreeWidth.JÄME, TreeType.OKASPUU);
        Tree tree2 = new Tree(5, 200, TreeWidth.PEENIKE, TreeType.LEHTPUU);
        tree1.TreeYear();
        tree2.TreeYear();
        System.out.println("Esimene puu on: " + tree1.getWidth());
        System.out.println("Teise puu vanus on " + tree2.GetAge() + " aastat.");
        System.out.println("Teise puu kõrgus on " + tree2.GetHeight() + " cm.");
    }
}