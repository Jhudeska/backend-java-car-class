public class Main {

    public static void main(String[] args){

//        Car myCar = new Car("Volvo", "Aygo", 2001,"geel", 1.2);
//
//        System.out.println(myCar.brand);
//        myCar.brand = "Volvo";
//        System.out.println(myCar.brand);

//        Car myCar = new Car("Volvo", "CX90" );
//        myCar.printCar();
        Driver driver = new Driver("jhudeska", 12345);
        Car myCar = new Car("Toyota", "Aygo", 2016,"blauwe", 1.2, driver);
        myCar.printCar2();

        Driver noah = new Driver("noah", 12345);
        Car fiat = new Car("Fiat", "500", 2019,"groen", 1.4, noah);
        fiat.printCar2();

        Driver tsean = new Driver("tsean", 12345);
        Car volvo = new Car("Volvo", "CX90", 2022,"zwart", 2.0, tsean);
        volvo.printCar2();
    }
}
