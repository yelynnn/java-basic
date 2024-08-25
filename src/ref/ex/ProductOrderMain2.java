package ref.ex;



public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder[] productOrders=new ProductOrder[3];

        productOrders[0]=createOrder("두부", 2000,2);
        productOrders[1]=createOrder("김치", 5000,1);
        productOrders[2]=createOrder("콜라", 1500,2);

        printOrders(productOrders);

        getTotalAmount(productOrders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder=new ProductOrder();
        productOrder.productName=productName;
        productOrder.price=price;
        productOrder.quantity=quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders){
        for (ProductOrder productOrder:productOrders){
            System.out.println("상품명: "+productOrder.productName+", 가격: "+productOrder.price+", 수량: "+productOrder.quantity);

        }
    }

    static void getTotalAmount(ProductOrder[] productOrders){
        int sum=0;
        int total=0;
        for (ProductOrder productOrder:productOrders){
            sum=productOrder.price*productOrder.quantity;
            total+=sum;
        }

        System.out.println("총 결제 금액: "+total);
    }
}
