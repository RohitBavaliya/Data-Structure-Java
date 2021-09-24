import java.util.Scanner;

/**The function accepts two arguments m and n which are integers. 
 * You are required to calculate the count of numbers having only 1, 4 and 9 as their 
 * digits between the numbers lying in the range m and n both inclusive, and return the same. 
 * Return -1 if m>n. */
public class CountSpecificNumbers
{
    static boolean checkNum(int num)
    {
        boolean flag = true;
        while(num!=0)
        {
            int rem = num%10;
            if(rem != 1 && rem != 4 && rem != 9)
            {
                flag = false;
                break;
            }
            num /= 10;
        }
        return flag;
    }
    public static int countNumber(int num1,int num2)
    {
        if(num1>num2)
        {
            return -1;
        }
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            boolean check = checkNum(i);
            if(check == true)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = countNumber(num1, num2);
        System.out.println(count);
    }
}