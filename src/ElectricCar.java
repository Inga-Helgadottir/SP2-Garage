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
                "batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
