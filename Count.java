public class Count 
{
    public static void main(String[] args) 
    {
        int arr[] = {65,84,0,75,6,1,0,4,36,85,0,24,64,0,91,27,0};    
        int i=0,b=arr.length,count=0;
        while(i<b)
        {
            if(arr[i] == 0)
            {
                System.out.println(arr[i]);
                count+=1;
            }
            i++;
        }
        System.out.println(count);
    }
}
