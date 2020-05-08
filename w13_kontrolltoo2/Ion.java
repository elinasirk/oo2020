package app;

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
            System.out.println("Nimetus: " + name + ", molekuraalmass: " + molecularWeight + " ,laeng: " + charge);
        }
        

    @Override
    public double getMolecularMass() {
        return molecularWeight;
    }

    @Override
    public int getCharge() {
        return charge;
    }
}
