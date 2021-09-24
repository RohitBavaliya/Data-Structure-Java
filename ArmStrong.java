import java.util.Scanner;

public class ArmStrong {
    public static boolean checkArmStrong(int num)
    {
        int temp = num;
        double sum = 0;
        while(temp!=0)
        {
            double reminder = temp%10;
            sum = sum + Math.pow(reminder, 3);
            temp/=10;
        }

        if(sum == num)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = checkArmStrong(num);
        if(check)
        {
            System.out.println("Armstrong");
        }else
            System.out.println("Not Armstrong");
    }
}
