import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta",-1.7f, "", 2015, "Россия", "механическая", "седан", "A343CK", 5, false, false, false, 100);
        Car audi = new Car("Audi", "A8 50 L TDI quattro",3.0f, "черный", 2020, "Германия", "автоматическая", "седан", "K768CA", 5, false,false, false, 129);
        Car bmw = new Car("BMW", "Z8",3.0f, "черный", 2021, "Германия", "механическая", "кабриолет", "M656KO", 2, true,false, false, 160);
        Car kia = new Car("Kia", "Sportage 4",2.4f,"красный", 2018, "Южная Корея", "механическая", "внедорожник", "B433TP", 5, false,true, true, 150);
        Car hyundai = new Car("Hyundai", "Avante",1.6f, "оранжевый", 2016, "Южная Корея", "автоматическая", "седан", "E541XH", 5, true,true, true, 135);

        Bus sprinter = new Bus("Mercedes-Benz", "Sprinter 214", 2000, "Германия", "серый", 113);
        Bus nefaz = new Bus("НефАЗ", "5299", 2021, "Россия", "синий", 93);
        Bus kamaz = new Bus("КамАЗ", "6292", 2018, "Россия", "синий", 110);

        System.out.println(kia);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(hyundai);

        System.out.println(nefaz);
        System.out.println(sprinter);
        System.out.println(kamaz);

    }
}
