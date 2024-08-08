import java.util.*;
public class split 
{
    public static void main(String[] args) {
        String a = "A quality product manufactured by ITC";
        String[] b = a.split(" ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
