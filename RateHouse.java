import java.util.Scanner;

public class RateHouse
{
    public static int getCount(int r,int unit,int n,int arr[])
    {
        int count = 0;
        int sum = 0;
        int food = r*unit;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            count++;
            if(sum>=food)
            {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getCount(r, unit, n, arr));
    }
}