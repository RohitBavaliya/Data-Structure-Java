import java.util.*;
public class ExponentMaximum
{
    static int countEx(int num)
    {
        int count = 0;
        while(num!=0 && num%2 == 0)
        {
            count++;
            num /=2;
        }
        return count;
    }
    public static int printNum(int num1,int num2)
    {
        int max = 0;
        int num = 0;
        for (int i = num1; i <= num2; i++) {
            int result = countEx(i);
            if(result>max)
            {
                max = result;
                num = i;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(printNum(num1,num2));
    }
}