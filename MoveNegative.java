import java.util.ArrayList;
import java.util.Iterator;

public class MoveNegative {
    public static void move(int arr[],int n)
    {
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(arr[i]<0)
            {
                negative.add(arr[i]);
            }
            else if(arr[i]>=0)
            {
                positive.add(arr[i]);
            }
        }
        // System.out.print(negative);
        // System.out.println(positive);
        Iterator<Integer> itr1 = negative.iterator();
        while(itr1.hasNext())
        {
            System.out.print(itr1.next()+" ");
        }
        Iterator<Integer> itr2 = positive.iterator();
        while(itr2.hasNext())
        {
            System.out.print(itr2.next()+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] =  { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        move(arr, arr.length);
    }
}
