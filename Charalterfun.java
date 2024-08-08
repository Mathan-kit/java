import java.util.*;
public class Charalterfun
{
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        char[] w = {'X','O','O','X'};
        char x = 'X';
        char o = 'O';
        char q[] =(Alter(w,x,o));
        System.out.println(Arrays.toString(w));
    }
    public static char[] Alter(char[] arr,char a,char b) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == a)
            {
                arr[i] = b;
            }else{
                arr[i] = a;
            }
        }
        return arr;
    }
}