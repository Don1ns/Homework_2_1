public class Main {
    public static void main(String[] args) {
        CarBook carBook = new CarBook();
        carBook.addCar("Lada", "Granta",-1.7f, "", 2015, "Россия");
        carBook.addCar("Audi", "A8 50 L TDI quattro",3.0f, "черный", 2020, "Германия");
        carBook.addCar("BMW", "Z8",3.0f, "черный", 2021, "Германия");
        carBook.addCar("Kia", "Sportage 4",2.4f,"красный", 2018, "Южная Корея");
        carBook.addCar("Hyundai", "Avante",1.6f, "оранжевый", 2016, "Южная Корея");

        carBook.printAllCars();
    }
}
