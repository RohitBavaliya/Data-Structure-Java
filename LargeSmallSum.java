import java.util.ArrayList;
import java.util.Collections;

/**
 * The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest largest element from the even positions and second smallest from the odd position of given ‘arr’
 * 
 * Assumption:

    All array elements are unique
    Treat the 0th position a seven

   NOTE
    Return 0 if array is empty
    Return 0, if array length is 3 or less than 3

   Example
   Input
    arr:3 2 1 7 5 4
   Output
    7
 */
public class LargeSmallSum {
    public static int getSum(int arr[])
    {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(i%2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        return even.get(even.size()-2)+odd.get(1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,7,5,4};
        int sum = getSum(arr);
        System.out.println(sum);
    }
}
