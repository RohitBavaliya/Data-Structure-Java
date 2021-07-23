public class ReverseArray{
    static void reverse(int arr[],int start,int end)
    {
        int temp;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7};
        printArray(arr, 8);
        reverse(arr, 0, 7);
        System.out.print("Reverse Array : ");
        printArray(arr, 8);
    }
}