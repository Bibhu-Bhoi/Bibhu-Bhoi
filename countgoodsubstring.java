public class countgoodsubstring {
    static int countgoodsubstrings(String s){
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            char a= s.charAt(i);
            char b=s.charAt(i+1);
            char c = s.charAt(i+2);
            if(a == b || b==c || a==c)
                continue;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "xyzzazk";
        System.out.println(countgoodsubstrings(s));
    }
    
}
