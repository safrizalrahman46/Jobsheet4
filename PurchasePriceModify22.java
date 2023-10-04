import java.util.Scanner;

public class PurchasePriceModify22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int price;
            int quantity;
            // int pageCount;
            double discount;
            double totalPrice;
            double purchasePrice;
            double totalDiscount;

                System.out.println("Input For Price :");
                price = input.nextInt();

                System.out.println("Input For Quantity :");
                quantity = input.nextInt();

                // input.next();
                System.out.println("Input Name Of Book :");
                String bookName = input.next();

                // input.next();
                System.out.println("Input Type of Book :");
                String typeBook = input.next();

                System.out.println("Input For Discount :");
                discount = input.nextDouble();

                    totalPrice = price * quantity;
                    totalDiscount = totalPrice * discount;
                    purchasePrice = totalPrice - totalDiscount;

                System.out.print("Total Discount = " + totalDiscount );
                System.out.print("Purchase Price = " + purchasePrice);
                System.out.println("Book Name = " + bookName); 
                System.out.println("Type Book = " + typeBook); 
            }

}


