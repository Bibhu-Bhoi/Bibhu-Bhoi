public class jumpgame2 {
    static int canJump(int[] nums){
        int jumps = 0;
        int current_end = 0;
        int far = 0;
        for(int i =0; i<nums.length-1;i++){
            far = Math.max(far, i+nums[i]);
            if(i == current_end){
                jumps++;
                current_end = far;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
    System.out.println(canJump(nums));
    }
    
}
