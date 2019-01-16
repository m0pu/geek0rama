public class Factorial {

    static long factorial(int input) {
        if (input == 1) {
            return 1;
        }
        long result = input * factorial(input  -1);
        return result;
    }

}
