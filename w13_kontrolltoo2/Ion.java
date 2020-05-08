
public class Ion implements Ions {

    private String name;
    private double molecularWeight;
    private int charge;

    public Ion(String name, double molecularWeight, int charge) {
        this.name = name;
        this.molecularWeight = molecularWeight;
        this.charge = charge;
    }

    @Override
    public void getInfo() {
        if(charge == 1){
            System.out.println("Nimetus: " + name + ", molekuraalmass: " + molecularWeight + " ,laeng: +.");
        }
        if(charge == -1){
            System.out.println("Nimetus: " + name + ", molekuraalmass: " + molecularWeight + " ,laeng: -.");
        }
        if(charge == 2){
            System.out.println("Nimetus: " + name + ", molekuraalmass: " + molecularWeight + " ,laeng: 2+.");
        }
        if(charge == -2){
            System.out.println("Nimetus: " + name + ", molekuraalmass: " + molecularWeight + " ,laeng: 2-.");
        }
        
    }
    
}
