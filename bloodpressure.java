import java.util.*;
public class bloodpressure
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner (System.in);
        System.out.print("Enter Diastollic blood pressure : ");
        int dbp = as.nextInt();
        System.out.print("Enter Systollic blood pressure : ");
        int sbp = as.nextInt();
        if((dbp >= 40 && dbp <= 60) && (sbp >=70 && sbp <=90))
        {
            System.out.println("Low");
        }
            else if((dbp > 60 && dbp <=80 )&&(sbp > 90 && sbp <= 120 ))
            {
                System.out.println("Normal");
            }
            else if((dbp > 80 && dbp <= 90)&&(sbp > 120 && sbp <= 140))
            {
                System.out.println("Prehypertension");
            }
            else if((dbp > 90 && dbp <=100 )&&(sbp > 140 && sbp <= 160))
            {   
                System.out.println("Hypertension stage 1");
            }
            else if((dbp > 100 || dbp > 120)&&(sbp > 160 || sbp > 190))
            {   
                System.out.println("Hypertension stage 2");
            }
        else
        {
            System.out.println("Blood pressure Diastollic and systollic starts from 40 & 70");
        }
    }
    
}
