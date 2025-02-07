import java.util.Scanner;

public class ChocolateWrappers {
    static int ChocolateWrapper(int ch, int wr){
        int days = ch;
        int total_wraps=ch+wr;
        int new_ch=0;
        while (total_wraps>=7) {
            new_ch = total_wraps/7;
            days = days + new_ch;
            total_wraps = new_ch+(total_wraps%7);
            
        }
        return days;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int wr = sc.nextInt();
        System.out.println(ChocolateWrapper(ch, wr));
    }
    
}
