import java.util.Scanner;

public class CheckEmail {
    public static int getIndex(String str)
    {
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '@')
            {
                index = i;
                break;
            }
        }
        return index;
    }
    public static String getMail(String email)
    {
        
        String sum = "";
        int index = getIndex(email);
        if(index<=0)
        {
            return "Invalid Email";
        }
        else if(index>0)
        {
            for (int i = 0; i < email.length(); i++) {
                if(index<=5)
                {
                    if(i>=0 && i<index)
                    {
                        sum = sum + '*';
                    }else
                    {
                        sum = sum + email.charAt(i);
                    }
                }
                else if(index>5)
                {
                    if(i>=3 && i<index)
                    {
                        sum = sum + '*';
                    }
                    else{
                        sum = sum + email.charAt(i);
                    }
                    
                }
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String outputMail = getMail(email);
        System.out.println(outputMail);

    }
}
