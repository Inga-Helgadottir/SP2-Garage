public class DieselCar extends Car{
    private boolean hasParticulateFilter;
    private int kmPrL;

    public DieselCar(int regNr, String brand, String model, int year, int nbrOfDoors, boolean hasParticulateFilter, int kmPrL) {
        super(regNr, brand, model, year, nbrOfDoors);
        this.hasParticulateFilter = hasParticulateFilter;
        this.kmPrL = kmPrL;
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
                "hasParticulateFilter=" + hasParticulateFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
