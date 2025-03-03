public class pivotindex {
    static int pivotIndex(int [] nums){
        int prefix=0;
        int sum =0;
        for(int num : nums){
            sum += num;
        }
        for(int i=0;i<nums.length;i++){
            if(prefix == sum-prefix-nums[i])
                return i;
            prefix += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    
}
