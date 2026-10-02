import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height of triangle (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // In khoảng trắng căn lề
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In các dấu sao: hàng i có (2*i - 1) dấu sao
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}