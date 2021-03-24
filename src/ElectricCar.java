public class ElectricCar extends Car {
    private int batteryCapacityKWh;
    private int maxKm;
    private int whPrKm;//kmPrL for en el bil

    public ElectricCar(int regNr, String brand, String model, int year, int nbrOfDoors, int batteryCapacityKWh, int maxKm, int whPrKm) {
        super(regNr, brand, model, year, nbrOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }
    public double calculateGreenOwnershipTax() {
        double whPrKmKmPrL = 100 / (this.whPrKm / 91.25);
        System.out.println("whPrKmKmPrL " + whPrKmKmPrL);
        System.out.println("whPrKm " + this.whPrKm);
        double sum = 0;
        if(whPrKmKmPrL <= 5){
            sum = 10470;
        }else if(whPrKmKmPrL > 5 && whPrKmKmPrL <= 10){
            sum = 5500;

        }else if(whPrKmKmPrL > 10 && whPrKmKmPrL <= 15){
            sum = 2340;

        }else if(whPrKmKmPrL > 15 && whPrKmKmPrL <= 20){
            sum = 1050;

        }else if(whPrKmKmPrL > 20 && whPrKmKmPrL < 50){
            sum = 330;
        }
        System.out.println("sum " + sum);
        return sum;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "regNr=" + getRegNr() +
                ", brand=" + getBrand() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                ", nbrOfDoors=" + getNbrOfDoors() +
                "batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
