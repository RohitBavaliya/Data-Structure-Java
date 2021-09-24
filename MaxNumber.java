import java.util.Scanner;

public class MaxNumber
{
    public void findMax(int arr[] )
    {
        int max = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
    public static void main(String[] args) {
        MaxNumber obj = new MaxNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        obj.findMax(arr);

    }
}