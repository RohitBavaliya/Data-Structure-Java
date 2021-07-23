// FixedPoint means Array[index] = index
public class FixedPoint {
    public int findFixedPoint(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == i)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FixedPoint obj = new FixedPoint();
        int arr[] = {23,34,6,3,76,4,3};
        System.out.println("Fixed Point is :"+ obj.findFixedPoint(arr));
    }
}
