import java.util.Scanner;

public class SumAndAverage {
    public static void ain(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double average;

        System.out.println("Input the 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number-" + i + " : ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        average = (double) sum / 10;

        System.out.println("The sum of 10 numbers is : " + sum);
        System.out.printf("The Average is : %.6f", average);
        sc.close();
    }
}