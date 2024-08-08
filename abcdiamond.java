import java.util.*;
public class abcdiamond 
{
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        char c = A.next().charAt(0);
        for(char i='a';i<=c;i++)
        {
            for(char j=c;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(char j=i;j>='a';j--)
            {
                System.out.print(j);
            }
            for(char j='a'+1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        char d=c;
        for(char i='a';i<=c;i++)
        {
            for(char j='a'-1;j<=i;j++)
            {
                System.out.print(" ");
            }
            
            for(char j=--d;j>='a';j--)
            {
                System.out.print(j);
            }
            for(char j='a'+1;j<=d;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
