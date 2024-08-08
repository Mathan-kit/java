import java.util.*;
public class upperstring 
{
    public static void main(String[] args) {
        String str = "india is my country";
        String a ="";
        String stt[]=str.split(" ");
            for(int i=0;i<stt.length;i++){
                System.out.println(stt[i]);
                String cae[]=stt[i].split("");
                for(int j=0;j<cae.length;j++){
                    if(j==0){
                        a+=cae[j].toUpperCase();
                    }
                    else{
                        a+=cae[j];
                    }
                }
                a+=" ";
            }

        System.out.println(a);
    }
}
