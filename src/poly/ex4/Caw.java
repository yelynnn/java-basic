package poly.ex4;

import poly.ex3.AbstractAnimal;

public class Caw extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move(){
        System.out.println("소 이동");
    }
}
