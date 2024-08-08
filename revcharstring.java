import java.util.*;
public class revcharstring 
{
    public static void main(String[] args) {
        String str = "Helloworld";
        String a ="";
        char stt[]= new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            stt[i] = str.charAt(i);
        }
        int mid = stt.length/2;
        for(int i=mid-1;i>=0;i--)
        {
            System.out.print(stt[i]);
            a+=stt[i];
            System.out.print(stt[i+mid]);
            a+=stt[i+mid];
        }
    }
}
