import java.util.Arrays;
import java.util.Scanner;

public class MinimizeDifference
{
    public static int minDiff(int arr[],int n,int k)
    {
        // sort array
        Arrays.sort(arr);
        // find difference
        int max = arr[n-1];
        int min = arr[0];
        int diff = max - min;

        // minimize difference
        for (int i = 1; i < n; i++) {
            max = Math.max(arr[i-1]+k, arr[n-1]-k);  // minimize max
            min = Math.min(arr[i]-k, arr[0]+k);     // maximize min

            diff = Math.min(diff, max-min); // minimize difference
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minDiff(arr, n, k));
    }
}