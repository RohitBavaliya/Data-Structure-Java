import java.util.Scanner;

public class FindMaxExponent {
    public static int countExponent(int num)
    {
        int temp = num;
        int count = 0;
        while(temp!=0 && temp%2==0)
        {
            count++;
            temp = temp/2;
        }
        return count;
    }

    public static int maxExponent(int num1,int num2)
    {
        int max = 0;
        int num = 0;
        for (int i = num1; i <= num2; i++) {
            int count = countExponent(i);
            // if count=max than next time max is changed
            if(count>max)
            {
                max = count;
                num = i;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int num = maxExponent(num1, num2);
        System.out.println(num);
    }
}
