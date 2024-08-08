import java.util.*;
public class funhy
{
    public static void main(String[] args) 
    {
        String[] word = {"-","-","-","-","-","-","-","-","-"};
        String res[] = matrix(word);
        System.out.println(res);
    }
    public static String[] matrix(String[] ar)
    {
        //Only for hyfen
        for(int i=0;i<ar.length;i++)
        {
           if((i+1)%3==0)
           {
            System.out.print(ar[i]);
            System.out.println();
           }
           else{
            System.out.print(ar[i]);
           }
        }
       //hypfen with "|" 
        for(int i=0;i<ar.length;i++)
        {
           if((i+1)%3==0)
           {
            System.out.print("|"+ar[i]+"|");
            System.out.println();
           }
           else{
            System.out.print("|"+ar[i]);
           }
        }
        return ar;
    }
}