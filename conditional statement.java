import java.util.Scanner;

 class conditionalstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }

        sc.close(); // Good practice to close the Scanner
    }
}