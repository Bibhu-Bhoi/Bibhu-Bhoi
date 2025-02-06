import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class KthLargestFactorofN {
    public static int KthLargestFact(int k,int n){
        ArrayList<Integer> factor = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                factor.add(i);
            }
        }
        Collections.sort(factor);
        if(k<=factor.size()){
            return factor.get(factor.size()-k);
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int result =KthLargestFact(k,n);
        System.out.println(result);

    }
}