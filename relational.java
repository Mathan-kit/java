import java.util.*;
public class relational {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Male (M) or Female (F) : ");
        char a = sc.next().charAt(0);
        if(a == 'M')
        {
            System.out.println("Male");
        }
        else if(a =='F')
        {
            System.out.println("Female");
        }
        else
        {
            System.out.println("Data not found");
        }

    }
    
}
