import java.util.Scanner;

public class WasteStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected in kg: - WasteStatus.java:8");
        double waste = sc.nextDouble();

        if (waste >= 100) {
            System.out.println("Collection Target Achieved - WasteStatus.java:12");
        } else {
            System.out.println("More Waste Collection Required - WasteStatus.java:14");
        }
    }
}