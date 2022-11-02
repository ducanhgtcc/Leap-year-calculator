import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("%d is a leap year", year);
        } else if (year % 400 == 0) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}