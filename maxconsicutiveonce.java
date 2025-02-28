public class maxconsicutiveonce {
    static int maxconsicutiveonces(int nums[],int k){
        int left = 0;
        int zero_count=0;
        int maxLength=0;
        for(int right = 0; right <nums.length;right++){
            if(nums[right] == 0)
                zero_count++;
            while (zero_count > k) {
                if(nums[left] == 0) zero_count--;
                left++;
                
            }
            maxLength = Math.max(maxLength, right - left +1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(maxconsicutiveonces(nums, k));
    }
    
}
