import java.util.Objects;

public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")){
            this.model = "default";
        }
        else{
            this.model = model;
        }
        if (country == null || country.equals("")){
            this.country = "default";
        }
        else{
            this.country = country;
        }
        if (color == null || color.equals("")){
            this.color = "белый";
        }
        else{
            this.color = color;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5f;
        }
        else{
            this.engineVolume = engineVolume;
        }
        if (year <= 0){
            this.year = 2000;
        }
        else{
            this.year = year;
        }
    }


    @Override
    public String toString() {
        return String.format("%s %s. Объем двигателя в литрах - %s л. Цвет кузова - %s. Год производства -  %d. Страна сборки - %s.", brand, model, engineVolume, color, year, country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }

}
