import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("The first " + n + " natural numbers are:");

       
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }

        System.out.println();
        System.out.println("The Sum of Natural Numbers up to " + n + " terms: " + sum);

        sc.close();
    }
}