package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders=new ProductOrder[n];
        for(int i=0;i<n;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName=scanner.nextLine();
            System.out.print("가격: ");
            int price=scanner.nextInt();
            System.out.print("수량: ");
            int quantity=scanner.nextInt();
            scanner.nextLine();

            productOrders[i]=createOrder(productName,price,quantity);

        }


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
