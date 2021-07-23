public class Fibonacci {

    static void printFibonacci(int num)
    {
        int f1 = 0;
        int f2 = 1;
        int i;

        if(num<1)
            return;
        
        System.out.print(f1+" ");

        for(i=1;i<num;i++)
        {
            System.out.print(f2+" ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }

    public static void main(String[] args) {
        printFibonacci(6);
    }


}
