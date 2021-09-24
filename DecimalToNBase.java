import java.util.Scanner;

public class DecimalToNBase {
    public static String getBaseNum(int decimal,int n)
    {
        String result = "";
        while(decimal!=0)
        {
            int rem = decimal%n;
            if(rem>9)
            {
                result  = (char)(rem+55) + result;
            }
            else
            {
                result  = rem + result;
            }
            decimal = decimal/n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = sc.nextInt();
        System.out.println(getBaseNum(decimal, n));
    }
    
}
