import java.util.*;
public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sp = 191;
        int profit = sp - costPrice;
        double ProfitPercentage = (profit/costPrice) * 100;
        System.out.print(
        "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sp +
        "\nThe Profit is INR " + profit + " and the Profit Percentage is " + ProfitPercentage);
    }
}
