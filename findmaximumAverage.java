public class findmaximumAverage {
    static double findmaximumAverages(int [] nums,int k){
        int sum = 0;
        for(int i=0;i<k;i++)
            sum += nums[i];
        double ans = sum;
        for(int i=k;i<nums.length;i++){
            sum += nums[i] - nums[i-k];
            ans = Math.max(ans,sum);

        }
        return ans/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findmaximumAverages(nums, k));
    }
    
}
