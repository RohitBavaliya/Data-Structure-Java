import java.util.Scanner;

public class ConsecutiveSubarray
{
    public static void findZeroSum(int n,int arr[])
    {
        int MAX = 1000;
        int resultArray[] = new int[MAX];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = 0;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum +arr[i];
            if(arr[i] == 0 || sum == 0 || resultArray[sum] == 1)
            {   
                System.out.println("1");
                return;
            }
            resultArray[sum] = 1;
        }
        System.out.println("0");
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findZeroSum(n, arr);
        
    }
}