package geekorama;

import java.util.HashMap;
import java.util.Map;

// inspired from cracking the code interview.
public class SumOfTwo {

    public static void main(String ... args) {
        sumOfTwo(new int[] {1, 0, -1, 2, 4, 6, 4}, 2);
    }

    static void sumOfTwo(int [] values, int value) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int index = 0; index < values.length; index++) {
            if (valueToIndex.containsKey(values[index])) {
                int firstIndex = valueToIndex.get(values[index]);
                int fistValue = values[index] - value;
                System.out.println("array[" + firstIndex + "]=" + fistValue);
                int secondValue = values[index];
                int secondIndex = index;
                System.out.println("array[" + secondIndex + "]=" + secondValue);
                break;
            } else {
                int rest = value - values[index];
                valueToIndex.put(rest, index);
            }
        }

    }
}
