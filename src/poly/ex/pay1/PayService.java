package poly.ex.pay1;

import poly.ex.pay1.KakaoPay;
import poly.ex.pay1.NaverPay;

public class PayService {

    //변하지 않는 부분
    public void processPay(String option, int amount){

        boolean result=false;
        AllPay allpay=PayStore.findPay(option);

        System.out.println("결제를 시작합니다: option="+option+", amount="+amount);

        result = allpay.pay(amount);


        if(result){
            System.out.println("결제가 성공했습니다");
        } else{
            System.out.println("결제가 실패했습니다");
        }
    }

}
