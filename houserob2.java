public class houserob2 {
    static int rob(int [] nums){
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        return Math.max(house_rob(nums,0,n-2), house_rob(nums,1,n-1));

    }
     private static int house_rob(int[] nums,int left,int right){
        int prev_rob = 0;
        int cur_rob = 0;
        for(int i=left;i<=right;i++){
            int new_rob = Math.max(prev_rob, cur_rob+nums[i]);
            cur_rob = prev_rob;
            prev_rob = new_rob;
        }
            return prev_rob;
    }
    public static void main(String[] args) {
        int [] nums ={1,2,3,1};
        System.out.println(rob(nums));
    }

    
}
