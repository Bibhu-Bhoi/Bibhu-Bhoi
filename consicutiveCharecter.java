import java.util.*;
public class consicutiveCharecter {
    static int maxPower(String s){
        int count=0;
        int max = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                max = Math.max(max, count);
            }
            else
                count =0;
        }
        return max+1;

    }
    public static void main(String[] args) {
        String s = "xyzazk";
        System.out.println(maxPower(s));
    }
    
}
