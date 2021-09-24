public class BinaryString
{
    public static int binaryOperation(String str)
    {
        int result = str.charAt(0) - '0';
        int n = str.length();

        for (int i = 1; i < n;) {
            char operation = str.charAt(i); // get operation
            i++;
            switch(operation)
            {
                case 'A':
                    result = result & str.charAt(i) - '0';
                    break;

                case 'B':
                    result = result | str.charAt(i) - '0';
                    break;

                case 'C':
                    result = result ^ str.charAt(i) - '0';
                    break;
                default:
                    break;
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int result = binaryOperation("0C1A1B1C1C1B0A0");
        System.out.println(result);

    }
}