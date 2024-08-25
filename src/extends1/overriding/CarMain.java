package extends1.overriding;

import extends1.ex3.ElectricCar;
import extends1.ex3.GasCar;
import extends1.ex3.HydrogenCar;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar=new ElectricCar();
        electricCar.move();

        GasCar gasCar=new GasCar();
        gasCar.move();

        HydrogenCar hydrogenCar=new HydrogenCar();
        hydrogenCar.move();
    }
}
