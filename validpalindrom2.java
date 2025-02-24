import java.util.*;
public class validpalindrom2 {
    static boolean validpalindrom(String s){
        int left=0,right=s.length()-1;
        while (left<right) {
            if(s.charAt(left) != s.charAt(right))
                return valid(s,left+1,right) || valid(s,left,right -1);
                left++;right--;
            
        }
        return true;
    }
    static boolean valid(String s,int left,int right)
    {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "abca";
        System.out.println(validpalindrom(s));
    }
    }

