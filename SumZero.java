import java.util.HashSet;
import java.util.Scanner;

// Find out single or consecutive number from arr with sum 0
// consecutive array element sum is zero than print 1 else print 0
public class SumZero {
    public static void result(int arr[],int n)
    {
        // set that store sum
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if(sum == 0 || arr[i] == 0 || set.contains(sum))
            {
                System.out.println("1");
                return;
            }
            set.add(sum);
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
        result(arr, n);
    }
    
}
