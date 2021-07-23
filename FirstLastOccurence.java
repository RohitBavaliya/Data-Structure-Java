// Find First and Last Occurence 
public class FirstLastOccurence {
    public static void findFirstLastOccurrence(int arr[],int x)
    {
        int first = -1;
        int last = -1;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            // if element not match with x than continue...
            if(arr[i] != x)
                continue;
            
            // store first match value
            if(first == -1)
            {
                first = i;
            }
            
            last = i;
        }
        if(first != -1)
        {
            System.out.println("First Occurrence : "+first);
            System.out.println("Last Occurrence : "+last);
        }
        else
        {
            System.out.println("Element Not Found!!");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,3,5,6};
        findFirstLastOccurrence(arr, 3);
    }
}
