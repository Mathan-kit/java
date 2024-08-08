import java.util.*;
public class switchname
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        switch(name)
        {
            case "mathan" :
                System.out.println("Name : Mathan Kumar");
                System.out.println("Phone : 8056971640");
                System.out.println("mail : mathankumar.m12@gmail.com");
                break;
            case "harish" :
               System.out.println(" Harish kumar "+"     "+ "9165156151"+ "      "+"harishkumar123@gmail.com");
               break;
            case "jaya" :
               System.out.println(" Jaya kumar "+"     "+ "7165165154"+ "      "+"jayakumar343@gmail.com");
               break;
            case "kishore" :
               System.out.println(" Kishore Kumar"+"     "+ "9456135847"+ "      "+"kishorekumarsd234@gmail.com");
               break;
        }

    }
    
}
