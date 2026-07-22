import java.util.Scanner;

public class day5_3 {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
     public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Height in metres: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);
        String category = getBMICategory(bmi);

        System.out.println("\nFITNESS REPORT");
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + category);

        if (category.equals("Underweight")) {
            System.out.println("Recommendation: Increase calorie intake and consult a nutritionist.");
        } else if (category.equals("Normal")) {
            System.out.println("Recommendation: Maintain regular exercise and balanced diet.");
        } else if (category.equals("Overweight")) {
            System.out.println("Recommendation: Exercise regularly and reduce calorie intake.");
        } else {
            System.out.println("Recommendation: Consult a doctor and follow a healthy lifestyle plan.");
        }
}
}
