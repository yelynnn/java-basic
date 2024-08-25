package extends1.super1;

public class Child extends Parent{

    public String value="child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = "+this.value); //this는 자신의 타입에서 value 값 찾음
        System.out.println("super value = "+super.value); //super는 부모 타입에서 value 값 찾음

        this.hello();
        super.hello();
    }

}
