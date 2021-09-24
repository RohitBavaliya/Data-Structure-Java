import java.util.Scanner;

public class StringOperation {
    public static int getResult(String str)
    {
        int result = str.charAt(0) - '0';  
        for (int i = 1; i < str.length(); ) 
        {
            char op = str.charAt(i);
            i++;
            switch(op)
            {
                case 'A': result = result & str.charAt(i)-'0';
                        break;
                case 'B': result = result | str.charAt(i)-'0';
                        break;
                case 'C': result = result ^ str.charAt(i)-'0';
                        break;
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next(); //1C0C1C1A0B1
        System.out.println(getResult(s));
    }
}
