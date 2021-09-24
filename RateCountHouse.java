/**
 *  Input:
    r: 7
    unit: 2
    n: 8
    arr: 2 8 3 5 7 4 1 2
    Output:
    4
 */
public class RateCountHouse {
    public static int noOfHouse(int r,int unit,int n,int arr[])
    {
        if(arr == null)
        {
            return -1;
        }
        int totalFood = r*unit;
        int count = 0; // count num of house
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum<=totalFood)
            {
                sum = sum + arr[i];
                count++;
            }
            
        }
        if(sum>=totalFood)
            return count;
        else
            return 0;
    }
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int n = 8;
        int arr[] = {2,8,3,5,7,4,1,2};
        int house = noOfHouse(r, unit, n, arr);
        System.out.println(house);
    }
    
}
