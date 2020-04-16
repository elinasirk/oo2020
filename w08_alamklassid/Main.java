public class Main {
    public static void main(String[] args) throws Exception {
        
        Shape shape1 = new Triangle(3, 4, 5);
        Shape shape2 = new Triangle(5, 5, 5);
        Shape shape3 = new Square (10);

        System.out.println("Kolmnurga ümbermõõt on " + shape1.getCircum());
        System.out.println("Kolmnurga ümbermõõt on " + shape2.getCircum());
        System.out.println("Ruudu ümbermõõt on " + shape3.getCircum());

    }
}