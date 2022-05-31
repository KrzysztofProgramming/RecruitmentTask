package app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSortTest {
    public static void main(String[] args) {
        new DataPrinter<Integer>().print(List.of(1, 4, 5, 6, 8, 3, 8));
        new DataPrinter<Double>().print(List.of(-9.3, 0.2, 4.d, 0.1, 5.d, 9.d));
        new DataPrinter<Integer>().print(Collections.emptyList());
        new DataPrinter<Double>().print(Arrays.asList(null, 5.0001));
        new DataPrinter<Double>().print(null);
    }
}

class DataPrinter<T extends Comparable<T>>{
    public void print(List<T> data){
        System.out.println("Input " + data + " Output: " + new BubbleSort<T>().sort(data));
    }
}
