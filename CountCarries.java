import java.util.Scanner;

public class CountCarries {
    public static int countCarry(int num1,int num2)
    {
        int temp1 = num1;
        int temp2 = num2;
        int carry = 0;
        int count = 0;

        while(temp1!=0 && temp2!=0)
        {
            int rem1 = temp1%10;
            int rem2 = temp2%10;
            if(rem1+rem2+carry>9)
            {
                count++;
                int sum = rem1+rem2+carry;
                carry = sum/10;
            }
            temp1/=10;
            temp2/=10;
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = countCarry(num1, num2);
        System.out.println(count);
    }
}
