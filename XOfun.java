import java.util.*;
public class XOfun
{
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        char[] w = {'-','-','-','-','-','-','-','-','-'};
        char p = 'X';
        for(int i=0;i<w.length;i++)
        {
            int pos = as.nextInt();
            Alter(w,pos,p);
            p=p=='X'?'O':'X';
        }
        // System.out.println(Arrays.toString(w));
    }
    public static void Alter(char[] arr,int a,char player)
    {
        // player ='X';
        arr[a] = player;
        for(int i=0;i<arr.length;i++)
        {   
        if((i+1)%3==0)
           {
            System.out.print(" "+arr[i]);
            System.out.println();
           }
           else{
            System.out.print(" "+arr[i]);
           }
        }
    }
}