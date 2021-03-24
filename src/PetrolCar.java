public class PetrolCar extends Car{
    private int octane; //tallet ligger som regel mellem 90 og 100
    private int kmPrL;

    public PetrolCar(int regNr, String brand, String model, int year, int nbrOfDoors, int octane, int kmPrL) {
        super(regNr, brand, model, year, nbrOfDoors);
        this.octane = octane;
        this.kmPrL = kmPrL;
    }

    public double calculateGreenOwnershipTax() {
        double sum = 0;
        if(this.kmPrL <= 5){
            sum = 10470;
        }else if(this.kmPrL > 5 && this.kmPrL <= 10){
            sum = 5500;

        }else if(this.kmPrL > 10 && this.kmPrL <= 15){
            sum = 2340;

        }else if(this.kmPrL > 15 && this.kmPrL <= 20){
            sum = 1050;

        }else if(this.kmPrL > 20 && this.kmPrL < 50){
            sum = 330;
        }
        return sum;
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
                "regNr=" + getRegNr() +
                ", brand=" + getBrand() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                ", nbrOfDoors=" + getNbrOfDoors() +
                ", octane=" + getOctane() +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
