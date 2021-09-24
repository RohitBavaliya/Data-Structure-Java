/** 
– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number

Input:
aA1_67
Output:
1
*/
public class CheckPassword {
    public static int checkPass(String str)
    {
        if(str.length()<4)
        {
            return 0;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9')
        {
            return 0;
        }
        int numCount = 0;
        int capCount = 0;
        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                numCount++;
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                capCount++;
            }
            if(str.charAt(i) == '/' || str.charAt(i) == ' ')
            {
                return 0;
            }
            
        }
        if(numCount>0 && capCount>0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        String str = "aA1_67";
        int result = checkPass(str);
        System.out.println(result);
    }
    
}
