public class Car {

    String brand;
    String type;
    int yearOfManufacture;
    String color;
    double engineCapacity;
    Driver driver;


    public Car(String brand, String type, int yearOfManufacture, String color, double engineCapacity, Driver driver){
        this.brand = brand;
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
    }

    public void printCar(){
        System.out.println("Deze " + this.brand + " " + this.type);
    }
    public void printCar2(){
        System.out.println("Deze " + this.brand + " " + this.type + " is " + this.color);
    }

}
