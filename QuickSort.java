/**
 * First find position of pivot element
 * create partition function
 * {
 *      select last element as pivot element
 *      define index i = i - 1
 *      pivot = arr[r]
 *      start for loop
 *      j = l to r-1
 *      if(arr[j]<pivot) than i++  and  swap(arr[i],arr[j])
 *      end for loop
 *      swap(arr[i+1],arr[r])
 *      return i+1
 * }
 * 
 * create Quicksort function
 * {
 *  if(l<r)
 *  {
 *      1.find pos of pivot
 *      2.apply quick sort left side of position
 *      3.apply quick sort right side of position 
 *  }
 * }
 * 
 */

public class QuickSort
{
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // create partition function
    public static int partition(int arr[],int l,int r)
    {
        // take last element as pivot element
        int pivot = arr[r];
        int i = l -1;
        for (int j = l; j < r; j++) {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        // i+1 is right position of pivot
        swap(arr, i+1, r);
        return i+1;
    }

    // quick sort function
    public static void quick(int arr[],int l,int r)
    {
        // check array has 2 or more element
        if(l<r)
        {
            int position = partition(arr, l, r);
            quick(arr, l, position-1);
            quick(arr, position+1, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,7};
        quick(arr, 0, 6);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}