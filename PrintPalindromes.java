import java.util.Scanner;

public class PrintPalindromes {
    public static int getReverse(int num)
    {
        int rem=0;
		int div = num;
		while (div != 0)
		{
		int r = div % 10;
		rem = (rem * 10) + r;
		div = div / 10;
		}
		
        return rem;
    }

    public static void printNum(int num1,int num2)
    {
        for (int i = num1; i <= num2; i++) { 
            if(i == getReverse(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printNum(num1, num2);
    }
}
