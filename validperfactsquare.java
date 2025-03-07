public class validperfactsquare {
    static boolean isPerfectSquare(int num){
        if(num == 1)
           return true;
        long left = 2,right = num / 2;
        while(left <= right){
            long mid = (left + right)/2;
            long sq = mid*mid;
            if(sq == num)
                return true;
            else if(sq<num)
                left = mid+1;
            else
                right = mid-1;
        }
        return false;
    } 
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    
}
