public class DecToNBase {
    public static String decToN(int n,int num)
    {
        String sum = "";
        while(num!=0)
        {
            int reminder = num%n;
            if(reminder>9)
            {
                sum = (char)(reminder + 55) +sum;
            }else
            {
                sum = reminder+sum;
            }
            num/=n;
        }
        return sum;
    }
    public static void main(String[] args) {
       String num = decToN(12, 718);
       System.out.println(num);
    }
}
