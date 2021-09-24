import java.util.HashSet;
import java.util.Scanner;

public class UnionArray {
    public static int getUnion(int arr1[], int arr2[], int m, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < m; j++) {
                set.add(arr1[j]);
        }
        for (int i = 0; i < n; i++) {
                set.add(arr2[i]);
        }

        return set.size();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Second array size:");
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(getUnion(arr1, arr2, m, n));

    }
}
