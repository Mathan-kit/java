import java.util.*;
public class XOgame
{
    public static char array[] ={'-','-','-','-','-','-','-','-','-'};
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char p = 'X';
        for(int i=0;i<array.length;i++)
        {
            int index = sc.nextInt()-1;
            if(move(index, p)){
                display(array);
                if(winner(p))
                {
                    break;
                }
                p=Switchplayer(p);
            }
            else
            {
                i--;
            }
        }
    }
    public static char Switchplayer(char player)
    {
        return player == 'X'?'O':'X';
    }
    public static void display(char[] arr)
    {
        //Only for hyfen
        for(int i=0;i<arr.length;i++)
        {
           if((i+1)%3==0)
           {
            System.out.print(" | "+arr[i]+" |");
            System.out.println();
           }
           else{
            System.out.print(" | "+arr[i]);
           }
        }
    }
    public static boolean move(int index,char player)
    {
        if(array[index]=='-')
        {
            array[index] = player;
            return true;
        }
        else
        {
            System.out.println("Invalid move");
            return false;
        }
    }
    public static boolean winner(char player) 
    {
        if(array[0]==player && array[1]==player && array[2]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else if(array[0]==player && array[3]==player && array[6]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else if(array[2]==player && array[5]==player && array[8]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else if(array[6]==player && array[7]==player && array[8]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else if(array[0]==player && array[4]==player && array[8]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else if(array[6]==player && array[4]==player && array[2]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else if(array[3]==player && array[4]==player && array[5]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else if(array[1]==player && array[4]==player && array[7]==player )
        {
            System.out.println(player+" is winner");
            return true;
        }
        else{
            return false;
        }
    }
}