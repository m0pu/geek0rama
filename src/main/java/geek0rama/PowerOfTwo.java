package geekogeek;

/**
 * Powers of two between 1 and a given number.
 */
public class PowerOfTwo {

    public static void main(String[] args) {
        powerOf2(8);
    }

    public static int powerOf2(int power) {
        if (power < 1) {
            return 0;
        }
        if (power == 1) {
            return 1;
        }
        System.out.println("---" + power);
        final int previous = powerOf2(power / 2);
        final int current = previous * 2;
        System.out.println(current);
        return current;
    }
}
