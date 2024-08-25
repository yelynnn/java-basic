package poly.ex.pay1;

public abstract class PayStore {
    //변하는 부분
    public static AllPay findPay(String option){
        AllPay allpay;
        if(option.equals("kakao")){
            allpay=new KakaoPay();
        } else if (option.equals("naver")) {
            allpay=new NaverPay();
        }else if (option.equals("new")) {
            allpay=new NewPay();
        }
        else{
            return new DefaultPay();
        }
        return allpay;
    }
}
