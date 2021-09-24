import java.util.Scanner;

public class CyclicOneRotation {
    public static void rotate(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
