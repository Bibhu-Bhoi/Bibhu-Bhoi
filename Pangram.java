import java.util.*;
public class Pangram {
    static boolean ChekIfPangram(String s){
        boolean[] visited = new boolean[26];
        for(int i=0;i<s.length();i++)
            if(s.charAt(i) >= 'a' && s.charAt(i)<='z')
                visited[s.charAt(i) - 'a']=true;
        for(int i=0;i<26;i++)
        
    }
    
}
