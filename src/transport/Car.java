package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport{
    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seats;
    private boolean winterTires;
    private Key key;


    public Car(String brand, String model, float engineVolume,
               String color, int year, String country,
               String transmission, String bodyType, String regNumber,
               int seats, boolean winterTires, boolean remoteStartEngine, boolean keylessAccess, int maxSpeed) {
        super(brand,model,year,country,color, maxSpeed);
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = brand;
        }
        if (seats <= 0) {
            this.seats = 5;
        } else {
            this.seats = seats;
        }

        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
        setKey(remoteStartEngine, keylessAccess);
    }
    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public void setSeasonTires() {
        switch (LocalDate.now().getMonthValue()) {
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
                this.winterTires = true;
                break;
            default:
                this.winterTires = false;
                break;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank()) {
            this.regNumber = "X000XX";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }
    public void setKey(boolean remoteStartEngine, boolean keylessAccess){
        this.key = new Key(remoteStartEngine,keylessAccess);
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return String.format("%s %s. Объем двигателя в литрах - %s л. Цвет кузова - %s. Год производства -  %d. Страна сборки - %s.", getBrand(), getModel(), engineVolume, getColor(), getYear(), getCountry());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && seats == car.seats && winterTires == car.winterTires && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(regNumber, car.regNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, transmission, bodyType, regNumber, seats, winterTires, key);
    }
}
