import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta",-1.7f, "", 2015, "Россия", "механическая", "седан", 346, 5, false);
        Car audi = new Car("Audi", "A8 50 L TDI quattro",3.0f, "черный", 2020, "Германия", "автоматическая", "седан", 768, 5, false);
        Car bmw = new Car("BMW", "Z8",3.0f, "черный", 2021, "Германия", "механическая", "кабриолет", 656, 2, true);
        Car kia = new Car("Kia", "Sportage 4",2.4f,"красный", 2018, "Южная Корея", "механическая", "внедорожник", 433, 5, false);
        Car hyundai = new Car("Hyundai", "Avante",1.6f, "оранжевый", 2016, "Южная Корея", "автоматическая", "седан", 541, 5, true);


    }
}
