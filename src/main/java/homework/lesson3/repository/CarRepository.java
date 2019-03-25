package homework.lesson3.repository;

import homework.lesson3.entity.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarRepository {

    private Car[] cars;

    public CarRepository(Car[] cars) {
        this.cars = cars;
    }

    public Car findById(Long id){
        for (Car car:cars) {
            if(car.getCarId().equals(id)){
                return car;
            }
        }
        return null;
    }

    public ArrayList<Car> findByProducer(String producer){
        ArrayList<Car> ar= new ArrayList<>();
        for (Car car:cars) {
            if(car.getProducer().equals(producer)){
                ar.add(car);
            }
        }
        return ar;
    }

    public ArrayList<Car> findByModel(String model){
        ArrayList<Car> ar= new ArrayList<>();
        for (Car car:cars) {
            if(car.getModel().equals(model)){
                ar.add(car);
            }
        }
        return ar;
    }

    public ArrayList<Car> findByYear(int year){
        ArrayList<Car> ar= new ArrayList<>();
        for (Car car:cars) {
            if(car.getYear()==year){
                ar.add(car);
            }
        }
        return ar;
    }


}
