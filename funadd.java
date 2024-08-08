import java.util.*;
public class funadd
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int num1 = as.nextInt();
        int num2 = as.nextInt();
        int sun=add(num1,num2);
        if(sun%10==0)
        {
            System.out.println(sun+" is divided by 10");
        }else{System.out.println(sun+" is not divided by 10");}
    }
    public static int add(int a,int b)
    {
        int c = a+b;  
        return c;
    }
}