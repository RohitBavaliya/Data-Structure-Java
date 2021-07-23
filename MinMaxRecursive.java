// Find Min & Max from array using recursive method

public class MinMaxRecursive {
    static class Pair
    {
        int min,max;
    }

    static Pair getMinMax(int arr[],int low,int high)
    {
        Pair full = new Pair();
        Pair left = new Pair();
        Pair right = new Pair();
        int mid;

        // Case-1 : Array Contains Only one element

        if(low == high)
        {
            full.max = arr[0];
            full.min = arr[0];
            return full;
        }

        // Case-2 : Array Contains Two Elements

        if(high == low+1)
        {
            if(arr[high]>arr[low])
            {
                full.max = arr[high];
                full.min = arr[low];
            }
            else if(arr[low]>arr[high])
            {
                full.max = arr[low];
                full.min = arr[high];
            }
            return full;
        }

        // Case-3: Array Contains more than two elements

        mid = (low+high)/2;
        left = getMinMax(arr, low, mid);
        right = getMinMax(arr, mid+1, high);

        if(left.min<right.min)
            full.min = left.min;
        else if(left.min>right.min)
            full.min = right.min;

        if(left.max<right.max)
            full.max = right.max;
        else if(left.max>right.max)  
            full.max = left.max;  

        return full;
    }

    public static void main(String[] args) {
        int arr[] = {100,34,248,35,3,45};
        Pair obj = getMinMax(arr, 0, 6);
        System.out.println("MIN: "+obj.min+"\n"+"MAX: "+obj.max);
    }
}
