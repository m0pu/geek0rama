package geekorama;

// inspired from cracking the code interview.
public class PowerOfTwo {

    public static void main(String[] args) {
        powerOf(11,3);
    }

    /**
     * Displays all the power of values from 1 until a given value.
     */
    private static int powerOf(int limit, int powerOf) {
        if (limit == 1) {
            return 1;
        }
        final int previous = powerOf(limit / powerOf, powerOf);
        final int current = previous * powerOf;
        System.out.println(current);
        return current;
    }
}
