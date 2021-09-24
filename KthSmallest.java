/**
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
 */
public class KthSmallest {
    // sort array using quick

    public static int partition(int arr[],int l,int r)
    {
        // last element is pivot
        int pivot = arr[r];
        int i = l-1;
        for (int j = l; j < r; j++) {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }

    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int position= partition(arr, l, r);
            quickSort(arr, l, position-1);
            quickSort(arr, position+1, r);
        }
    }

    public static void kthSmallestElement(int arr[],int l,int r,int k)
    {
        quickSort(arr, l, r);
        for (int i = 0; i <=r ; i++) {
            if(i == k-1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        kthSmallestElement(arr, 0, 5, 3);
    }
}
