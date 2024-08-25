package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s="Hello java";

        //static이 붙은 정적 메서드는 인스턴스 생성 없이 클래스 명을 통해서 바로 호출 가능
        String deco = DecoUtil2.deco(s);

        System.out.println("before: "+s);
        System.out.println("after: "+deco);
    }
}
