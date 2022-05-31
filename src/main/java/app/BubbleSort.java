package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BubbleSort<T extends Comparable<T>> {

    public List<T> sort(List<T> input){
        if(input == null) throw new NullPointerException("input cannot be null!");
        List<T> filtered = new ArrayList<>(input.stream().filter(Objects::nonNull).toList());
        for(int i=0; i<filtered.size(); i++){
            for(int j=0; j<filtered.size() - i - 1; j++){
                if(filtered.get(j).compareTo(filtered.get(j + 1)) <= 0) continue;
                T temp = filtered.get(j);
                filtered.set(j, filtered.get(j + 1));
                filtered.set(j + 1, temp);
            }
        }
        return filtered;
    }
}
