import java.util.Scanner;

public class SuperiorElement {
    public static int countElements(int arr[],int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j < n; j++) {
                if(arr[i]<=arr[j])
                    break;
            }
            if(j == n)
            {
                sum = sum +1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countElements(arr, n));
    }
}
