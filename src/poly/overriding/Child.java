package poly.overriding;

public class Child extends Parent{

    public String value="child";

    //단축키 Ctrl+O
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
