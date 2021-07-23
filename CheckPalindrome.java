public class CheckPalindrome {
    public static boolean check(String s)
    {
        int i = 0;
        int j = s.length()-1;

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            else
            {
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abba";
        String r = "abcdedcba";
        System.out.println(check(s));
        System.out.println(check(r));
    }
    
    
}
