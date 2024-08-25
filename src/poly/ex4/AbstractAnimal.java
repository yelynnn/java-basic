package poly.ex4;

public abstract class AbstractAnimal {

    //추상 메소드가 하나라도 있으면 추상 클래스로 만들어야 함
    //추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 함
    //메서드 바디 부분 생성 시 컴파일 오류 발생
    public abstract void sound();

    public abstract void move();
}
