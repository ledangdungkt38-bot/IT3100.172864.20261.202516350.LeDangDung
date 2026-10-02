import java.util.Arrays;
import java.util.Scanner;

public class SortCostArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter your own array? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        double[] numbers;

        if (choice.equals("yes") || choice.equals("y")) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            numbers = new double[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextDouble();
            }
        } else {
            // Mảng mẫu theo hình minh họa trong đề bài
            numbers = new double[]{1789, 2035, 1899, 1456, 2013};
            System.out.println("Using predefined array from example: " + Arrays.toString(numbers));
        }

        // In mảng ban đầu
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sắp xếp mảng tăng dần
        Arrays.sort(numbers);
        System.out.println("Sorted array:   " + Arrays.toString(numbers));

        // Tính tổng và trung bình cộng
        double sum = 0;
        for (double val : numbers) {
            sum += val;
        }
        double average = (numbers.length > 0) ? (sum / numbers.length) : 0;

        System.out.println("Sum of elements:     " + sum);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
}