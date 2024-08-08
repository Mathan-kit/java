import java.util.*;
public class Char{
    public static void main(String[] args) {
        String word = "leetcode";
        char[] arr = new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            arr[i] = word.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        String needle = "leet";
        char[] array = new char[word.length()];
        for(int i=0;i<needle.length();i++)
        {
            array[i] = needle.charAt(i);
        }
        System.out.println(Arrays.toString(array));
        String res ="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == array[i]){
                System.out.print(array[i]);
            }
        }
    }
}