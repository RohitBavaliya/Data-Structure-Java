import java.util.Scanner;

class SecondGreatest
{
    public static int secondGreat(int a,int b,int c)
    {
       if(a>b && a>c)
       {
           if(b>c)
           {
               return b;
           }
           else
           {
               return c;
           }
       }
       else if(b>c)
       {
           if(a>c)
           {
               return a;
           }
           else
           {
               return c;
           }
       }
       else if(c>b)
       {
           if(b>a)
           {
               return b;
           }
           else
           {
               return a;
           }
       }
       return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(secondGreat(a, b, c));
    }
}