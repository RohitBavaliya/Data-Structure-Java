import java.util.Scanner;

public class PrimeNum {
    public static boolean checkPrime(int num)
    {
        if(num == 1)
        {
            return false;
        }
        int count = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = checkPrime(num);
        if(prime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
        
    }
}
