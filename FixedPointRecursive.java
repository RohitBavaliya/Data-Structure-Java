
// Recursive Method to find fixed point

public class FixedPointRecursive {
    public static int BinarySearch(int arr[],int low,int high)
    {
        // Binay Search Method
        // Array always sort
        if(high>=low)
        {
            int mid = (low+high)/2;
            if(mid == arr[mid])
                return mid;
            
            if(mid > arr[mid])
                return BinarySearch(arr, mid+1, high);
            else
                return BinarySearch(arr, low, mid-1);
        }
        // if not get any fixed point
        return -1;    
    }

    public static void main(String[] args) {
        int arr[] = {-10,-2,0,3,6,9,23};
        System.out.println("Fixed Point: "+BinarySearch(arr, 0, arr.length-1));
    } 
    
}
