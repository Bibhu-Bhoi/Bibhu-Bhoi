public class findthepeakelement {
    public static int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[mid+1])
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,2,1,4};
        System.out.println(findPeakElement(nums));
    }
    
}
//1,two sum ii,
