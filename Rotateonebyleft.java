import java.util.Arrays;
public class Rotateonebyleft {

    public static void main(String[] args) {
        int[] nums= {2,3,4,5,6,7};
        int temp=nums[0];
        int i;
        for(i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(nums));
    }
}
