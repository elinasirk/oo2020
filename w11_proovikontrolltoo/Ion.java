
public class Ion implements SubstanceInterface {

    private int ionCharge1;
    private int ionCharge2;
    private String ionName1;
    private String ionName2;


    public Ion(int ionCharge1, int ionCharge2, String ionName1, String ionName2) {
        this.ionCharge1 = ionCharge1;
        this.ionCharge2 = ionCharge2;
        this.ionName1 = ionName1;
        this.ionName2 = ionName2;
    }

    public int getCharge1() {
        return ionCharge1;
    }

    public int getCharge2() {
        return ionCharge2;
    }
    
    public String getName1(){
        return ionName1;
    }

    public String getName2(){
        return ionName2;
    }

}
