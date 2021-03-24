public class PetrolCar extends Car{
    private int octane; //tallet ligger som regel mellem 90 og 100
    private int kmPrL;

    public PetrolCar(int regNr, String brand, String model, int year, int nbrOfDoors, int octane, int kmPrL) {
        super(regNr, brand, model, year, nbrOfDoors);
        this.octane = octane;
        this.kmPrL = kmPrL;
    }

    public int getOctane() {
        return octane;
    }

    public void setOctane(int octane) {
        this.octane = octane;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "octane=" + octane +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
