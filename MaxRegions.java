import java.util.Scanner;

public class MaxRegions {
    public long getMaxRegion(int lines)
    {
        long M = 1000000007;
        int reg = 1 + lines*(lines+1)/2;
        return reg%M;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        MaxRegions obj = new MaxRegions();
        System.out.println(obj.getMaxRegion(lines));
        
    }
}
