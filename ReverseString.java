public class ReverseString {
    public static void main(String[] args) {
        String str = "Rohit Bavaliya";
        char[] arr = str.toCharArray();
        reverse(arr, arr.length-1);

    }

    static void reverse(char[] arr,int len)
    {
        for (int i = len; i>=0; i--) {
            System.out.print(arr[i]+"");
        }
    }
}
