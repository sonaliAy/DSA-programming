public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 34, 67, 5, 90};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum Element = " + min);
        System.out.println("Maximum Element = " + max);
    }
    
}
