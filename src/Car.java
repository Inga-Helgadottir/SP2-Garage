abstract class Car{
    private int regNr;
    private String brand;
    private String model;
    private int year;
    private int nbrOfDoors;

    public Car(int regNr, String brand, String model, int year, int nbrOfDoors) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.nbrOfDoors = nbrOfDoors;
    }

    public abstract double calculateGreenOwnershipTax();

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNbrOfDoors() {
        return nbrOfDoors;
    }

    public void setNbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNr=" + regNr +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", nbrOfDoors=" + nbrOfDoors +
                '}';
    }
}
