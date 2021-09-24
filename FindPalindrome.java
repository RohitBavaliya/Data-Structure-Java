import java.util.Scanner;

public class FindPalindrome {
    
    // check number is palindrome 
    public static boolean checkPalindrome(int num)
    {
        int temp = num;
        int sum = 0;
        while(temp!=0)
        {
            int rem = temp%10;
            sum = sum*10 +rem;
            temp/=10;
        }
        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //  print all Palindromes
    public static void printPalindrome(int num1,int num2)
    {
        for (int i = num1; i <= num2; i++) {
            if(checkPalindrome(i))
            {
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printPalindrome(num1, num2);
    }
}
