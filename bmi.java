import java.util.*;
public class bmi
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int w = a.nextInt();
        float h = a.nextFloat();
        float b = h * h;
        float s = w/b;
        System.out.println(s); 
    }
}