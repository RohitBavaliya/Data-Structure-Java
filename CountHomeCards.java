import java.util.Scanner;

public class CountHomeCards {
    public int countCards(int n)
    {
        int total = n*(3*n+1)/2;
        return total;
    }
    public static void main(String[] args) {
        CountHomeCards obj = new CountHomeCards();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.countCards(n));
    }
}
