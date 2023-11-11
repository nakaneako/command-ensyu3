import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("身長を入力してください: ");
        double height = scanner.nextDouble();

        System.out.print("体重を入力してください: ");
        double weight = scanner.nextDouble();

        double bmi = weight / height * height

        System.out.println(getBMICategory(bmi));
    }