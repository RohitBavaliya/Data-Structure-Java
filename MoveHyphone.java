// move hyphone at start
public class MoveHyphone {
    public static String move(String str)
    {
        String sum = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='-')
            {
                sum = str.charAt(i)+sum;
            }
            else
                sum = sum+str.charAt(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        String str = "Move-Hyphens-to-Front";
        System.out.println(move(str));
    }
    
}
