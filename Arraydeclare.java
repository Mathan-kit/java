import java.util.*;
public class Arraydeclare 
{
    public static void main(String[] args)    
    {
        int p[] = {11,12,13,14,15,16,17,18,19,20};
        int temp = p[0];
        p[0] = p[9];
        p[9] = temp;
        System.out.println(p[0]);
        System.out.println(p[1]);
        System.out.println(p[2]);
        System.out.println(p[3]);
        System.out.println(p[4]);
        System.out.println(p[5]);
        System.out.println(p[6]);
        System.out.println(p[7]);
        System.out.println(p[8]);
        System.out.println(p[9]);        
    }
}
