public class Example {
    public static void main(String[] args) {
        int[] num = new int[]{2,4,3,1,9,9};
        int largest = num[0];
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }



            }

        }
        for(int)
    }
    
}
