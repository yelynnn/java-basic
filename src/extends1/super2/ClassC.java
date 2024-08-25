package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        super(10,20); // ClassB에는 기본 생성자가 없기 때문에 super로 직접 생성해야 함
        System.out.println("ClassC 생성자");
    }
}
