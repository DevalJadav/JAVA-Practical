import java.util.Scanner;

public class for_factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, number, fact = 1;
        System.out.print("Enter Value: ");
        number = input.nextInt();
        input.close();

        // method 1
        // for (i = 1; i <= number; i++) {
        // fact = fact * i;
        // }

        // method 2
        for (i = number; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}