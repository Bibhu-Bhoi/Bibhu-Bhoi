public class Secondlargest {
    public static void main(String[] args) {
        int [] nums = new int[]{2,3,2,1,5,2};
        int largest = nums[0];
        for(int i=0;i < nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
                
            }
        }
        System.out.println(largest);

        int Secondlargest=-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]>Secondlargest && nums[j] != largest){
                Secondlargest = nums[j];

            }
        }
        System.out.println("Second largest number is:"+Secondlargest);
    }

    
}
