package homework.lesson3;

import homework.lesson3.entity.Car;
import homework.lesson3.repository.CarRepository;
import homework.lesson3.service.CarService;
import homework.lesson3.ui.ConsoleUi;

public class ConsoleApplication {
    public static void main(String[] args) {

        Car[] cars=new Car[10];

        cars[0]=new Car(1L, "X5", "BMW", 2012, "black",2000000, "AA1234AA");
        cars[1]=new Car(2L, "530", "BMW", 2011, "green",1900000, "AA4321AA");
        cars[2]=new Car(3L, "X5", "BMW", 2014, "white",2700000, "AA6758AA");
        cars[3]=new Car(4L, "530", "BMW", 2015,3300000);
        cars[4]=new Car(5L, "X5", "BMW", 2012, "black",2300000, "AA8734AA");
        cars[5]=new Car(6L, "ES", "Lexus", 2012, "bronze",2400000, "AA2356AA");
        cars[6]=new Car(7L, "ES", "Lexus", 2015,3600000);
        cars[7]=new Car(8L, "ES", "Lexus", 2012, "black",270000, "AH1234AA");
        cars[8]=new Car(9L, "LX", "Lexus", 2012,5200000);
        cars[9]=new Car(10L, "LX", "Lexus", 2016, "black",7000000, "BH1234AA");

        CarRepository carRepository=new CarRepository(cars);
        CarService carService=new CarService(carRepository);
        ConsoleUi consoleUi=new ConsoleUi(carService);

        consoleUi.run();

    }
}
