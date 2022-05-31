package app;

public class BalancedWordsCounterTest {
    public static void main(String[] args) {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        showWordBalanceCount("aabbabcccba", counter);
        showWordBalanceCount("", counter);
        showWordBalanceCount("abababa1", counter);
        showWordBalanceCount(null, counter);
    }

    private static void showWordBalanceCount(String input, BalancedWordsCounter counter){
        System.out.println("Input: " + input + " Output: " + counter.count(input));
    }
}
