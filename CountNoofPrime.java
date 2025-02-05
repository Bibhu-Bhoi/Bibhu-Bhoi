public class CountNoofPrime {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
//import java.util.*;
//public class 
