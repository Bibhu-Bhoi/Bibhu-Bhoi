import java.util.Scanner;
public class SortingArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size =sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter" +size+ "Elements:");
        for(int i = 0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The Entered Array Elements are:");
        for(int n : nums){
            System.out.println(n + " ");
        }
        for(int k = 0;k<size-1;k++){
            for(int m=0; m<size-k-1;m++){
                if(nums[m]>nums[m+1]){
                    int temp = nums[m];
                    nums[m]=nums[m+1];
                    nums[m+1]=temp;
                }
            }
        }
        System.out.println("Aftre Sorting the Elements are:");
        for(int num : nums)
        System.out.print(num +" ");

    }
}