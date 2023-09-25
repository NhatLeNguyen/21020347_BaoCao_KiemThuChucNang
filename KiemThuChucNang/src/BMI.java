import java.util.Scanner;
public class BMI {
    public static void main(String[] args) throws  Exception {
        double weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meter):");
        height = scanner.nextDouble();
        double bmi= weight/Math.pow(height, 2);
        System.out.println(calculateBMI(bmi));

    }
    static String calculateBMI(double bmi) throws Exception{
        if (bmi>0 && bmi < 18.5)
            return "Underweight";
        else if (bmi >=18 && bmi < 25.0)
            return "Normal";
        else if (bmi >=25)
            return "Overweight";

        return "ValueError";
    }
}