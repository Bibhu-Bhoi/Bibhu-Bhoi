import java.util.*;

public class SquareNoPatternArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input number
        int num = sc.nextInt();
        sc.close();
        
        int length = 2 * num - 1;
        int[][] arr = new int[length][length];

        int start = 0;
        int end = length;

        while (num > 0) {
            for (int i = start; i < end; i++) {
                for (int j = start; j < end; j++) {
                    arr[i][j] = num;
                }
            }
            start++;
            end--;
            num--;
        }

        // Print the matrix
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

