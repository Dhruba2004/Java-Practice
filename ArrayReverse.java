import java.util.* ;
import java.util.ArrayList;

public class ArrayReverse
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int n=arr.size();
        int s =m+1;
        int e =n-1;
        while(s<e){
            Collections.swap(arr,s,e);
            s++;
            e--;
        }
    }
}

