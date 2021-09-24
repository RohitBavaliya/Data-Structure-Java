import java.util.Scanner;

public class SuperierElement {
    public int countSuperierElemet(int arr[],int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j < n; j++) {
                if(arr[i] <= arr[j])
                {
                    break;
                }
            }
            if(j == n)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SuperierElement obj = new SuperierElement();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = obj.countSuperierElemet(arr, n);
        System.out.println(count);
    }
}
