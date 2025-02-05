import java.util.*;
public class FriendlyPair {
    static int sum(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;

    }
    static boolean isFriendlyPair(int n1,int n2){
        int AIofA=sum(n1);
        int AIofB=sum(n2);
        return (double)AIofA/n1==(double)AIofB/n2;
    }
    
    public static void main(String[] args) {
        int n=6;
        int n1=28;
        boolean result= isFriendlyPair(n, n1);
        System.out.println(result);

    }
    
}
