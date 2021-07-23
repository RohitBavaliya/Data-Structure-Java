
// Dutch National Flag Algorithm
public class SortZeroOneTwo {

    public static void sort(int arr[])
    {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;

        while(mid<=high)
        {
            switch (arr[mid]) {
                case 0:
                    temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;    

                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;

                default:
                    break;
            }
        }
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,2,1,2,0,0,0,1,2};
        sort(arr);
        printArray(arr);
        
    }
    
}
