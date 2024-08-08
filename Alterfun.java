import java.util.*;
public class Alterfun
{
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        String[] w = {"-","-","-","-","-"};
        int pos = as.nextInt();
        String sd = as.next();
        String q[] =(Alter(w,pos,sd));


        System.out.println(Arrays.toString(w));
    }
    public static String[] Alter(String[] arr,int p, String a) {
        arr[p] = a;
        return arr;
    }
}