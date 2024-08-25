package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data=new Data();

        //참조 대상의 값은 변경 가능
        //final은 참조 대상 자체를 다른 대상으로 변경 불가하지 못함
        data.value=10;
        System.out.println(data.value);
        data.value=20;
        System.out.println(data.value);
    }
}
