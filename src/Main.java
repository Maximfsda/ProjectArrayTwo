import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("TasOne");
        int sum = 0;
        for( int arrs : arr) {
            sum+= arrs;
        }
        System.out.println("Сумма трат за месяц составила + "+ sum +" рублей.");

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

