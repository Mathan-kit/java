import java.util.*;
public class printinsertpos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,3,5,6};
        int t = arr[0]; 
        int target = scan.nextInt();
        for(int i=1;i<255;i++)
        {
            if(t==target)
            {
                System.out.println(i-1);
                break;
            }
            t++;
        }
    }
    
}
