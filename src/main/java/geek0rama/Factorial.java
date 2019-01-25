package geekorama;
// inspired from cracking the code interview.
public class Factorial {

    public static void main(String ... args) {
        long factorial = factorial(3);
        System.out.println(factorial);
    }

    static long factorial(int input) {
        if (input == 1) {
            return 1;
        }
        return input * factorial(input  -1);
    }
}
