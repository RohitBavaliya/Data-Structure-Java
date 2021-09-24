import java.util.Scanner;

public class BalanceFruits {
    public static int balanceFruit(int a,int m,int rs)
    {
        if(a>m)
            return rs - (a-m);
        else if(a == m)
            return rs;
        else if(a<m)
            return rs + (m-a);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int rs = sc.nextInt();
        int rupee = balanceFruit(a, m, rs);
        System.out.println(rupee);

    }
}
