package homework.lesson3.entity;

public class Car {
    private Long carId;
    private String model;
    private String producer;
    private int year;
    private String color;
    private int price;
    private String registrationNumber;

    public Car(Long carId, String model, String producer, int year, String color, int price, String registrationNumber) {
        this.carId = carId;
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Car(Long carId, String model, String producer, int year, int price) {
        this.carId = carId;
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Long getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
