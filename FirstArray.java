public class FirstArray{
    public static void main(String[] args) {
        int [] nums = new int[]{3,2,1,5,2};
        int largest = nums[0];
        for(int i=0;i < nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
                
            }
        }
        System.out.println(largest);
    }
}