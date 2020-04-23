public class Apple{
    int firstAmount;
    int newAmount;

    public Apple(int firstAmount, int newAmount) {
        this.firstAmount = firstAmount;
        this.newAmount = newAmount;
    }

    public int getBought(){
        if(firstAmount <= newAmount){
            return 0;
        }
        else {
            return firstAmount - newAmount;
        }

    }
}

