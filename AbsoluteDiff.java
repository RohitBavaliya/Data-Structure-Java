import java.util.Scanner;

public class AbsoluteDiff {
    public static int countNum(int arr[],int num,int diff,int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(Math.abs(num-arr[i])<=diff)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,3,14,56,77,13};
        int n = arr.length;
        int num = 13;
        int diff = 2;
        System.out.println(countNum(arr, num, diff, n));
    }
}
