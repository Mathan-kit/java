import java.util.*;
public class funreturn
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        String arr[] = {"Stone","Paper","Scissor"};
        int t = as.nextInt();
        int youCount = 0;
        int compCount = 0;
        for(int i=0; i<t; i++)
        {
            int num = as.nextInt();
            int random = (int)(Math.random()*arr.length);
            System.out.println(arr[num]+" "+arr[random]);
            switch(num){
                case(0):
                    if(Rock(num,random)){
                        youCount++;
                    } else {
                        compCount++;
                    }
                    break;
                case(1):
                    // Paper(num,random,arr);
                    if(Paper(num,random,arr)){
                        youCount++;
                    } else {
                        compCount++;
                    }
                    break;
                case(2):
                    // res=Scissor(num,random,arr);
                    if(Scissor(num,random,arr)){
                        youCount++;
                    } else {
                        compCount++;
                    }
                    break;
                }
        }
        if(youCount < compCount){
            System.out.println("They win");
        }else if (youCount > compCount) {
            System.out.println("You win");
        } else {
            System.out.println("Draw");
        }
    }
    public static boolean Rock(int a,int b)
    {
        if(b==1){
            return (false);
            // System.out.println(arr[b]);
        }else{
            return (true);
            // System.out.println(arr[a]);
        }
    }
    public static boolean Paper(int a,int b,String[] arr)
    {
        if(b==2){
            return (false);
            // System.out.println(arr[b]);
        }else{
            return (true);
            // System.out.println(arr[a]);
        }
        // if(b==2)
        // {
        //     System.out.println(arr[a]);
        // }
        // else{
        //     if(a==1 && b==2){
        //         System.out.println(arr[b]);
        //     }
        //     else{System.out.println(arr[1]);}
        // }
    }
    public static boolean Scissor(int a,int b,String[] arr)
    {
        if(b==0){
            return (false);
            // System.out.println(arr[b]);
        }else{
            return (true);
            // System.out.println(arr[a]);
        }
        // if(a==2 && b==0)
        // {
        //     System.out.println(arr[b]);
        // }
        // else{
        //     if(a==2 && b==1){
        //         System.out.println(arr[a]);
        //     }
        //     else{System.out.println(arr[2]);}
        // }
    }
}