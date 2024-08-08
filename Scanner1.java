import java.util.*;
public class Scanner1
 {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Product :");
        String product =a.nextLine();
        System.out.print("Quantity : ");
        int quantity = a.nextInt();
        System.out.print("Price : ");
        int price = a.nextInt();
        System.out.print("Total : ");
        int total = quantity * price ;
        System.out.println(+total);
        System.out.print("Product1 :");
        String product1 =a.next();
        System.out.print("Quantity1 : ");
        int quantity1 = a.nextInt();
        System.out.print("Price1 : ");
        int price1 = a.nextInt();
        System.out.print("Total1 : ");
        int total1 = quantity1 * price1 ;
        System.out.println(+total1);
        System.out.print("Product2 :");
        String product2 =a.next();
        System.out.print("Quantity2 : ");
        int quantity2 = a.nextInt();
        System.out.print("Price2 : ");
        int price2 = a.nextInt();
        System.out.print("Total2 : ");
        int total2 = quantity2 * price2 ;
        System.out.println(+total2);
        System.out.print("Product3 :");
        String product3 =a.next();
        System.out.print("Quantity3 : ");
        int quantity3 = a.nextInt();
        System.out.print("Price3 : ");
        int price3 = a.nextInt();
        System.out.print("Total3 : ");
        int total3 = quantity3 * price3 ;
        System.out.println(+total3);
        System.out.println("Product Name |  Quantity  |   Price   |  Total  " );       
        System.out.println(product+ "                  "  +quantity+ "        " +price+ "        " +total);
        System.out.println(product1+ "                "  +quantity1+ "        " +price1+ "        " +total1);
        System.out.println(product2+ "                  "  +quantity2+ "        " +price2+ "        " +total2);
        System.out.println(product3+ "                 "  +quantity3+ "        " +price3+ "        " +total3);
    }
    
}
