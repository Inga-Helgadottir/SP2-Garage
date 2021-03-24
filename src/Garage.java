import java.util.ArrayList;

public class Garage {
    private String name;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Garage(String name) {
        this.name = name;
    }

    public ArrayList<Car> addToArrayList(Car car1, Car car2, Car car3, Car car4, Car car5, Car car6) {
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        return cars;
    }

    public String printAllCars(){
        for (Car c:cars) {
            System.out.println(c.toString());
            return c.toString();
        }
        return cars.toString();
    }
    public void calculateGreenFeedForCarpark(){
        //calculate all green charges for all cars
        int result = 0;
        System.out.println();
        for (Car c:cars) {
            System.out.println(c.toString());
            System.out.println(c.calculateGreenOwnershipTax());
            result += c.calculateGreenOwnershipTax();
        }
        System.out.println("res " + result);
    }

    @Override
    public String toString() {
        return name + "{" +
                ", cars=" + printAllCars() + '\'' +
                '}';
    }
}
