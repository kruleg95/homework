package homework.lesson3.ui;

import homework.lesson3.entity.Car;
import homework.lesson3.service.CarService;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUi {

    private CarService carService;
    private Scanner scanner;

    public ConsoleUi(CarService carService) {
        this.carService = carService;
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        int controller=10;
        boolean isFinded=false;
        ArrayList<Car> carsList= new ArrayList<>();
        while(controller!=0) {
            System.out.println("Please select certain operation. \n" +
                    "1. Output cars list according certain producer. \n" +
                    "2. Output cars list according model and exploitation years. \n" +
                    "3. Output cars list according year of production and price. \n" +
                    "0.Exit");

            controller=scanner.nextInt();

            switch (controller){
                case 1: {
                    System.out.println("Enter producer");
                    carsList=carService.findByProducer(scanner.next());
                    isFinded=true;
                }break;
                case 2:{
                    System.out.println("Enter model and exploitation years");
                    carsList=carService.findByModelAndYear(scanner.next(),scanner.nextInt(),2019);
                    isFinded=true;
                }break;
                case 3:{
                    System.out.println("Enter year of production and price");
                    carsList=carService.findByYearAndPrice(scanner.nextInt(),scanner.nextInt());
                    isFinded=true;
                }break;
                case 0:{
                    System.out.println("Goodbye =(");
                }break;
                default:{
                    System.out.println("Enter right number.");
                }
            }
            if(carsList.size()>0&&isFinded){
                writeOutList(carsList);
                isFinded=false;
            }if(isFinded){
                System.out.println("No any car =(");
                isFinded=false;
            }

        }
        }

        public void writeOutList(ArrayList<Car> carArrayList){
            for (Car cars:carArrayList) {
                System.out.println(cars.toString());
            }
        }
}
