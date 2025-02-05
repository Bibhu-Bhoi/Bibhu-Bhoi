import java.util.Scanner;

public class Bestpricetosell2 {
    static int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1]; 
            }

        }
        return profit;
    } 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] price = new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        System.out.println(maxProfit(price));
    }
    
}

