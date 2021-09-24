import java.util.Scanner;

public class MaxSumSubarray {
    public static int maxSum(int arr[],int n)
    {
        int curr = 0;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            curr = curr + arr[i];
            
            if(curr>max)
            {
                max = curr;
            }

            if(curr<0)
            {
                curr = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr, n));
    }
}
