import java.util.Scanner;
/**
 * InnerPurchasePrice22
 */

public class PurchasePrice22 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

            int price;
            int quantity;
            double discount=0.1;
            double totalPrice;
            double purchasePrice;
            double totalDiscount;
            
            System.out.println("Input For Price :");
            price = input.nextInt();

            System.out.println("Input For Quantity :");
            quantity = input.nextInt();

                totalPrice=price*quantity;
                totalDiscount=totalPrice*discount;
                purchasePrice=totalPrice-totalDiscount;

            System.out.println("Total Discount = "+totalDiscount);
            System.out.println("Purchase Price = "+purchasePrice);
    }

}