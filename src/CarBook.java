import java.util.Arrays;

public class CarBook {
    private Car[] cars;
    public CarBook() {
        this.cars = new Car[0];
    }
    Car[] getCars(){
        if (cars == null){
            cars = new Car[0];
        }
        return cars;
    }
    public void addCar(String brand, String model, float engineVolume, String color, int year, String country){
        this.cars = Arrays.copyOf(getCars(), getCars().length + 1);
        Car newCar = new Car(brand, model, engineVolume, color, year, country);
        this.cars[this.cars.length - 1] = newCar;
    }
    public void printAllCars() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i].toString());
            }
        }
    }

}
