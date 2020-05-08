public class Substance implements SubstanceInterface {
    
    private String name;
    private double molecularMass;

    public Substance(String name, double molecularMass) {
        this.name = name;
        this.molecularMass = molecularMass;
    }

    public double getmolecularMass() {
        return molecularMass;
    }

    public double checkCharge(){
        if(getCharge1() - getCharge2() == 0){
            System.out.println("Laengud on võrdsed, nimetus: " + getName1() + getName2());
        }
        if(getCharge2() - getCharge1() == 0){
            System.out.println("Laengud on võrdsed, nimetus: " + getName2() + getName1());
        }
        else{
            System.out.println("Laengud ei ole võrdsed");
        }
    }
}
        
