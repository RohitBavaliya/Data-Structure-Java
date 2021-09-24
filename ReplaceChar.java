import java.util.Scanner;

public class ReplaceChar {
    public static String replaceCharacter(String str,char ch1,char ch2)
    {
        String sum = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch1)
            {
                sum = sum + ch2;
            }
            else if(str.charAt(i) == ch2)
            {
                sum = sum +ch1;
            }
            else
            {
                sum = sum +str.charAt(i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        String newString = replaceCharacter(str, ch1, ch2);
        System.out.println(newString);
    }
}
