import java.util.Scanner;

public class SquareNoPattern {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int num = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


