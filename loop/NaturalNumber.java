import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The first " + n + " natural numbers are:");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }