import java.lang.Math;

public class Route {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private int stops;

    public Route(int startX, int startY, int endX, int endY, int stops) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.stops = stops;
    }

    public double getLength(){
        double length = Math.sqrt(Math.pow((endX - startX), 2) + Math.pow((endY - startY),2));
        return Math.round(length);
    }

    public int getStops(){
        return stops;
    }
    
}