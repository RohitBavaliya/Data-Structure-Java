import java.util.Scanner;

public class SumOfPro {
    public static int getSum(int arr1[],int arr2[],int n)
    {
        if(n==0)
        {
            return -1;
        }
        int sum = 0;
        for (int i= 0;i<n;i++) {
            sum = sum + arr1[i]*arr2[n-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {6,5,4,3,2,1};

        int sum = getSum(arr1, arr2, 6);
        System.out.println(sum);
    }
}
