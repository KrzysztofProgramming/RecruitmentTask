package app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {

    public int count(String input){
        if(input==null) throw new NullPointerException("input may not be null");
        if(!hasOnlyLetters(input)) throw new RuntimeException("input may only contains letters");
        if(input.length() == 0) return 0;
        return countBalances(input);
    }

    private int countBalances(String word){
        if(word.length() == 1) return 1;
        return countBalanceFromBeginning(word) + countBalances(word.substring(1));
    }

    private int countBalanceFromBeginning(String word){
        Map<Character, Integer> charCounter = new HashMap<>(word.length());
        int balanceCounter = 0;
        for(char c: word.toCharArray()){
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
            if(allEquals(charCounter.values())) balanceCounter++;
        }
        return balanceCounter;
    }

    private boolean allEquals(Collection<?> value){
        return value.stream().distinct().count() <=1;
    }

    private boolean hasOnlyLetters(String word){
        for(char c: word.toCharArray()){
            if(!Character.isLetter(c)) return false;
        }
        return true;
    }
}
