public class Main {

    public static void main(String[] args) {
        Car d1 = new DieselCar(6789, "brand", "model", 2000, 5, false, 5);
        Car d2 = new DieselCar(2133, "brand2", "model2", 2010, 3, true, 10);
        Car p1 = new PetrolCar(4568, "brand3", "model3", 2020, 5, 95, 15);
        Car p2 = new PetrolCar(7768, "brand4", "model4", 2015, 3, 100, 20);
        Car e1 = new ElectricCar(3654, "brand5", "model5",2019, 5, 75, 160000, 118);
        Car e2 = new ElectricCar(3148, "brand6", "model6", 2012, 3, 75, 160000, 162);
        Garage g = new Garage();
        //Er der en bedre måde at gøre det på???????????????????????????
        //Måske en måde hvor man kan tilføje så mange som man vil
        g.addToArrayList(d1, d2, p1, p2, e1, e2);

        //g.printAllCars();
        //der er et eller andet galt med min electric car udregningerne
        g.calculateGreenFeedForCarpark();
    }
}
