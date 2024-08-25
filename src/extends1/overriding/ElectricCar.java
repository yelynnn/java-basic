package extends1.overriding;

import extends1.ex3.Car;

public class ElectricCar extends Car {

    //메서드 오버라이딩은 하위 클래스에서 상위 클래스의 메서드를 재정의하는 것
    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge(){
        System.out.println("출발합니다.");
    }
}
