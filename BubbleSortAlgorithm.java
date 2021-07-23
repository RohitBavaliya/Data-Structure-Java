// Bubble Sort Algorithm

public class BubbleSortAlgorithm
{
    public static void main(String[] args) {
        System.out.println("Sort Array Using Bubble Sort");
        int arr[] = {23,1,56,22,6,34};

        System.out.println("Original Array : ");
        printArr(arr);

        System.out.println("Sorted Array :");
        bubbleSort(arr);
        printArr(arr);
       
    }

    static void bubbleSort(int arr[])
    {
        boolean swap;
        for (int i = 0; i < arr.length-1; i++) {
            swap = false;
            
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }    
            }
            if(swap == false)
                break;
        }
    }

    static void printArr(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}