/**
Input:
arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3
*/
public class AbsoluteDiff {
    public static int findCount(int arr[],int num,int diff)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(num-arr[i])<=diff)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {12,3,14,56,77,13};
        int num = 13;
        int diff = 2;
        int count = findCount(arr, num, diff);
        System.out.println(count);
    }
    
}
