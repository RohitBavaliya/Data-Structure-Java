/**
 * Dautch national flag algorithm
 * check value of arr[mid]
 * 
 * if 0 than swap(low,mid) and mid++ , low++
 * if 1 than mid++
 * if 2 than swap(mid,high) and high--
 */
public class SortZeroOneTwo {
    public static void swap(int arr[],int i,int j)
    {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void dnf(int arr[],int n)
    {
        int mid = 0;
        int low = 0;
        int high = n-1;
        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,1,2,0,0};
        dnf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
