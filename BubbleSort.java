/**
 * Compare two adjucent element
 * if thay are in wrong order than swap
 */
public class BubbleSort {

    public static void bubble(int arr[],int n)
    {
        int counter = 1;
        // flag false show array not sorted
        boolean flag = false;
        while(counter<n)
        {
            for (int i = 0; i < n-counter; i++) {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }  
            }
            // if array is sorted in any iteration
            if(flag == false)
            {
                break;
            }
            counter++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,7,9,7,8};
        bubble(arr, 6);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
