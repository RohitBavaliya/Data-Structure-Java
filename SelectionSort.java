/**
 * Selection sort
 * compare all array element with first element
 */

public class SelectionSort {

    // selection sort
    public static void selectionSortAlgo(int arr[],int n)
    {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
           
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,7,9,7,8};
        selectionSortAlgo(arr, 6);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
