public class Rotatestring {
    static boolean isRotatestring(String s, String g){
        return s.length() == g.length() && (s+s).contains(g);
    }
    public static void main(String[] args) {
        String s = "abcde";
        String g = "cdeab";
        System.out.println(isRotatestring(s, g));
    }
    
}
