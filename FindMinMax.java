// Find Min & Max Element form array
public class FindMinMax {
    //  Structures

    static class Pair
    {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[],int size)
    {
        Pair obj = new Pair();

        // if array contain ony one element

        if(size == 1)
        {
            obj.min = arr[0];
            obj.max = arr[0];
        }

        // if array have more that one elements

        if(arr[0]>arr[1])
        {
            obj.max = arr[0];
            obj.min = arr[1];
        } else if(arr[1]>arr[0])
        {
            obj.max = arr[1];
            obj.min = arr[0];
        }

        for (int i = 2; i < size; i++) {
            if(arr[i]>obj.max)
                obj.max = arr[i];
            else if(arr[i]<obj.min)
                obj.min = arr[i];
        }
        return obj;
    }

    public static void main(String[] args) {
        int arr[] = {500,20,4,450,300,37};
        Pair obj = getMinMax(arr, 6);
        System.out.println("Min: "+obj.min+" \n"+"Max: "+obj.max);
    }
}
