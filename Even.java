public class Even 
{
    public static void main(String[] args) 
    {
        int i = 0;
        int a = 10;
        int b = 0;
        while(i<=a)
        {
            if(i%2==0)
            {
                b=b+i;
            }
            i++;
        }
        System.out.println(b);
    }    
}
