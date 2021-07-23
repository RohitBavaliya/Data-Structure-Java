public class Heap {

    public void hepify(int arr[], int n,int i)
    {
        int max = i;        // root
        int left = 2*i+1;  //left child index
        int right = 2*i+2;  // right child index


        // check left child is greater than root than set as root
        if(left<n && arr[left]>arr[max])
        {
            max = left;
        }

        // check right child is greater than root than set as root
        if(right<n && arr[right]>arr[max])
        {
            max = right;
        }

        if(max!=i)
        {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            hepify(arr, n, max);
        }

    }

    public void sort(int arr[])
    {
        int len = arr.length;

        //  build heap
        for (int i = len/2-1; i >=0 ; i--) {
            hepify(arr, len, i);
        }

        // sort array
        for (int i = len-1; i>0; i--) {
            int temp = arr[0]; // root or heighest element
            arr[0] = arr[i];
            arr[i] = temp;  

            hepify(arr, i, 0);
            
        }
    }

    static void printArray(int arr[])
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {31,543,25,12,56,5,3};
        Heap heap = new Heap();
        heap.sort(arr);
        System.out.println("Sorted Array..");
        printArray(arr);
    }
    
}
