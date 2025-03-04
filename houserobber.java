public class houserobber {
    static int rob(int[] nums){
        int prev_rob = 0;
        int cur_rob = 0;
        for(int num : nums){
            int new_rob = Math.max(prev_rob, cur_rob+num);
            cur_rob = prev_rob;
            prev_rob = new_rob;
        }
        return prev_rob;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        System.out.println(rob(nums));
    }
    
}
