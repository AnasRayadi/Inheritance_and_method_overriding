
public class Main {
    public static void main(String[] args) {
        var car=new Car("Toyota","Model1",2023,4);
        car.displayInfo();

        System.out.println("----------------------");

        var motor = new Motorcycle("Docker","Model2",2023,true);
        motor.displayInfo();
    }
}


