import java.util.Scanner;

public class KthSmallestElement {
    public static int kthSmallest(int arr[], int low, int high, int k) {
        if (low < high) {
            int pos = partition(arr, low, high);
            if (pos == k) {
                return arr[pos];
            } else if (pos > k) {
                return kthSmallest(arr, low, pos - 1, k);
            } else {
                return kthSmallest(arr, pos + 1, high, k);
            }
        }
        return 0;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter Index:");
        int k = sc.nextInt();
        System.out.println(kthSmallest(arr, 0, n-1, k-1));
    }
}