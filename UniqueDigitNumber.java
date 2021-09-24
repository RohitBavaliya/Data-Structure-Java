import java.util.Scanner;

public class UniqueDigitNumber {
    public static void uniDigiNUmbers(int l,int r)
    {
        for (int i = l; i <= r; i++) {
            int temp = i;
            int arr[] = {0,0,0,0,0,0,0,0,0,0};
            while(temp!=0)
            {
                int rem = temp%10;
                if(arr[rem] == 1)
                    break;
                arr[rem] = 1;
                temp = temp/10;
            }
            if(temp == 0)
            {
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        uniDigiNUmbers(l, r);
        
    }
}
