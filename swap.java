import java.util.*;
public class swap 
{
    public static void main(String[] args) 
    {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter A value: ");
        int a = A.nextInt();
        System.out.print("Enter B value : ");
        int b = A.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);                
        System.out.println(b);
    }    
}
