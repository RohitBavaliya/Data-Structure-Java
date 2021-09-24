import java.util.Scanner;

public class CountDigitOccurrences {
    public static boolean checkOccurrence(int num,int x)
    {
        boolean flag = false;
        while(num!=0)
        {
            int rem = num%10;
            if(rem == x)
            {
                flag = true;
                break;
            }
            num/=10;
        }
        return flag;
    }
    public static int countDigitOccurrence(int l,int u,int x)
    {
        int count = 0;
        for (int i = l; i <= u; i++) {
            boolean check = checkOccurrence(i, x);
            if(check == true)
            {
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int x = sc.nextInt();
        int count = countDigitOccurrence(l, u, x);
        System.out.println(count);
        
    }

 
    
}
