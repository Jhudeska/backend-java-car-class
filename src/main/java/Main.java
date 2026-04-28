public class Main {

    public static void main(String[] args){

        Car myCar = new Car("Volvo", "Aygo", 2001,"geel", 1.2);

        System.out.println(myCar.brand);
        myCar.brand = "Volvo";
        System.out.println(myCar.brand);
    }
}
