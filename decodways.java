public class decodways {
    static int numDecoding(String s){
        if(s == null || s.length()==0 || s.charAt(0) == '0')
            return 0;
        int n = s.length();
        int [] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=1;i<n;i++){
            dp[i+1] = dp[i];
            int twoDigit = Integer.parseInt(s.substring(i-1, i+1));
            if(twoDigit >= 10 && twoDigit <=26)
                dp[i+1] = dp[i+1] + dp[i-1];
        }
        return dp[n];

    }
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(numDecoding(s));
    }
    
    
}
