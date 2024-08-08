import java.util.*;
public class Matrixadd
{
    public static void main(String[] args) 
    {
     Scanner as = new Scanner(System.in);
     int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
     int b[][] = {{1,1,1},{1,1,1},{1,1,1}};
     for (int i = 0; i<a.length; i++) 
     {
        for(int j = 0; j<a.length ; j++) 
        {
            System.out.print(a[j][i]+b[i][j]+" ");
        }
        System.out.print("\n");
     }        
    }
}