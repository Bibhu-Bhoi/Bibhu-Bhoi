import java.util.*;
public class Bestpricetosell {
    static int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxnum=0;
        for(int price : prices){
            if(price<minPrice){
                minPrice=price;
            int profit = price-minPrice;
            maxnum = Math.max(maxnum, profit); 
            }

        }
        return maxnum;
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
