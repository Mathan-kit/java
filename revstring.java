import java.util.*;
public class revstring 
{
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        String a = "A product by ITC";
        String res="";
        String[] b = a.split(" ");
        int c = b.length;
      
        for(int i=c-1;i>=0;i--)
        {
           res+= b[i]+" ";   
        }
       System.out.println(res);
    }
}
