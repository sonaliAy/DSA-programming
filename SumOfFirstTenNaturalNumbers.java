public class SumOfFirstTenNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("The first 10 natural numbers are:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("The Sum is: " + sum);
    }
}

