public class Square extends Shape {
    double a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getCircum() {
        return 4*a;
    }

}