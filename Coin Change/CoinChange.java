import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total amount
        System.out.print("Enter the total amount: ");
        int amount = scanner.nextInt();

        // Input coin denominations
        System.out.print("Enter the number of coin denominations: ");
        int n = scanner.nextInt();
        int[] coins = new int[n];
        System.out.print("Enter the coin denominations: ");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        // Dynamic Programming to find the minimum coins
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        System.out.println(dp[amount] == Integer.MAX_VALUE ? "Not possible to make the amount" : "Minimum coins needed: " + dp[amount]);
        scanner.close();
    }
}
