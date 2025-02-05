import java.util.ArrayList;
public class UglyNo2 {
 public static void main(String[] args) {
    
 } 

    public int nthUglyNumber(int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); // The first ugly number is 1
        int L2 = 0; // Pointer for multiples of 2
        int L3 = 0; // Pointer for multiples of 3
        int L5 = 0; // Pointer for multiples of 5

        while (nums.size() < n) {
            // Calculate the next ugly number as the minimum of the three candidates
            int next = Math.min(nums.get(L2) * 2, Math.min(nums.get(L3) * 3, nums.get(L5) * 5));
            nums.add(next);

            // Move the pointers forward if their corresponding candidate was chosen
            if (next == nums.get(L2) * 2) {
                L2++;
            }
            if (next == nums.get(L3) * 3) {
                L3++;
            }
            if (next == nums.get(L5) * 5) {
                L5++;
            }
        }

        // Return the nth ugly number
        return nums.get(nums.size() - 1);
    }
}  
