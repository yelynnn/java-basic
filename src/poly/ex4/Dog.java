package poly.ex4;

import poly.ex3.AbstractAnimal;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move(){
        System.out.println("개 이동");
    }
}
