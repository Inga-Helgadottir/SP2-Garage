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

    public void calculateGreenFeeForGarage(){
        System.out.println("\ncalculating green fee for the entire garage");
        int result = 0;
        int size = cars.size();
        for (Car c:cars) {
            if(c == cars.get(size-1)){
                System.out.print(c.calculateGreenOwnershipTax());
            }else{
                System.out.print(c.calculateGreenOwnershipTax() + " + ");
            }
            result += c.calculateGreenOwnershipTax();
        }
        System.out.println(" = " + result);
    }

    public String toString(){
        System.out.println(this.name + "{");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
        System.out.println("}");
        return cars.toString();
    }
}
