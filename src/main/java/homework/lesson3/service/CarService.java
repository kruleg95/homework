package homework.lesson3.service;

import homework.lesson3.entity.Car;
import homework.lesson3.repository.CarRepository;

import java.util.ArrayList;

public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car findById(Long id) {
        return carRepository.findById(id);
    }

    public ArrayList<Car> findByProducer(String producer) {
        return carRepository.findByProducer(producer);
    }

    public ArrayList<Car> findByModel(String model) {
        return carRepository.findByModel(model);
    }

    public ArrayList<Car> findByYear(int year) {
        return carRepository.findByYear(year);
    }

    public ArrayList<Car> findByModelAndYear (String model, int exploitationYears, int nowadaysYear){
        ArrayList<Car> arr=findByModel(model);

        for (int i = 0; i < arr.size(); i++) {
            if((nowadaysYear-arr.get(i).getYear())<exploitationYears){
                arr.remove(i);
            }
        }
        return arr;
    }

    public ArrayList<Car> findByYearAndPrice (int year, int price){
        ArrayList<Car> arr=findByYear(year);

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getPrice()<price){
                arr.remove(i);
            }
        }
        return arr;
    }

}
