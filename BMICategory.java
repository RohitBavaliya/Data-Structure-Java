import java.util.Scanner;

public class BMICategory {
    public static int getBMICategory(int weight, float height)
    {
        double BMI = weight / Math.pow(height, 2.0);
        if(BMI<18)
            return 0;
        else if(BMI>=18  && BMI< 25)
            return 1;
        else if(BMI>=25 && BMI<30)
            return 2;
        else if(BMI>=30 && BMI<40)
            return 3;
        else if(BMI>40)
            return 4;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        float height = sc.nextFloat();
        int result = getBMICategory(weight, height);
        System.out.println(result);
    }
}
