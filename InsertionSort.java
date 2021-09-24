
public class InsertionSort {

    public static void sort(int arr[],int n)
    {
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>curr)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,7,9,7,8};
        sort(arr, 6);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
