import java.util.Scanner;

public class MoveRight {
    public static String move(String str)
    {
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-')
            {
                s2 = s2+ str.charAt(i);
            }
            else
                s1 = s1 + str.charAt(i);
        }
        return s1+s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(move(str));

    }
}
