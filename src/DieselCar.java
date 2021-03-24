public class DieselCar extends Car{
    private boolean hasParticulateFilter;
    private int kmPrL;

    public DieselCar(int regNr, String brand, String model, int year, int nbrOfDoors, boolean hasParticulateFilter, int kmPrL) {
        super(regNr, brand, model, year, nbrOfDoors);
        this.hasParticulateFilter = hasParticulateFilter;
        this.kmPrL = kmPrL;
    }

    public double calculateGreenOwnershipTax() {
        double sum = 0;
        if(this.kmPrL <= 5){
            sum = 10470 + 1390;//11860
        }else if(this.kmPrL > 5 && this.kmPrL <= 10){
            sum = 5500 + 2770;//8270

        }else if(this.kmPrL > 10 && this.kmPrL <= 15){
            sum = 2340 + 1850;//4190

        }else if(this.kmPrL > 15 && this.kmPrL <= 20){
            sum = 1050 + 1390;//2440

        }else if(this.kmPrL > 20 && this.kmPrL <= 50){
            sum = 330 + 130;//460
        }
        if(!this.hasParticulateFilter){
            sum += 1000;
        }
        return sum;
    }

    public boolean isHasParticulateFilter() {
        return hasParticulateFilter;
    }

    public void setHasParticulateFilter(boolean hasParticulateFilter) {
        this.hasParticulateFilter = hasParticulateFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "regNr=" + getRegNr() +
                ", brand=" + getBrand() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                ", nbrOfDoors=" + getNbrOfDoors() +
                ", hasParticulateFilter=" + hasParticulateFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
