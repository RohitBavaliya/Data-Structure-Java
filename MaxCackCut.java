import java.util.Scanner;

public class MaxCackCut {
    public long findMaxPices(int n)
    {
        long M = 1000000007;
        if(n == 0)
        {
            return 1;
        }
        if(n == 1)
        {
            return 2;
        }
        return (n+ findMaxPices(n-1))%M;
    }
    public static void main(String[] args) {
        MaxCackCut obj = new MaxCackCut();
        Scanner sc = new Scanner(System.in);
        int cuts = sc.nextInt();
        System.out.println(obj.findMaxPices(cuts));
    }
}
