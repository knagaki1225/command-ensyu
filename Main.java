import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("height(cm):");
        double height = Integer.parseInt(sc.nextLine());
        System.out.print("weight(kg):");
        double weight = Integer.parseInt(sc.nextLine());

        height /= 100;
        height *= height;

        double bmi = weight / height;

        System.out.println("BMI:" + String.format("%.2f", bmi));
    }
}