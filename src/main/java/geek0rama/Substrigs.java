package geekorama;

// inspired from cracking the code interview.
public class Substrigs {

    public static void main(String[] args) {
        substrings("abcde");
    }

    /**
     * Prints all the  all substring for the given  string
     * O(n) = n(n+1)/2
     */
    static void  substrings(String input) {
        for (int charIndex = 0; charIndex < input.length(); charIndex++) {
            for (int index = charIndex + 1; index < input.length(); index++) {
                System.out.println(input.substring(charIndex, index));
            }
        }
    }
}
