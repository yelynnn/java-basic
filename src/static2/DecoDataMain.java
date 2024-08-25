package static2;

//import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1=new DecoData();
        data1.instanceCall();

        //instanceValue 값은 매번 초기화되기 때문에 출력시 값이 1로 유지됨
        System.out.println("3. 인스턴스 호출2");
        DecoData data2=new DecoData();
        data2.instanceCall();

        //인스턴스를 통한 접근
        DecoData data3=new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
