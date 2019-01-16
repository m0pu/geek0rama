import java.util.ArrayList;
import java.util.List;

public class StringPermutation1 {

    public static void main(String[] args) {
        final List<String> result  =new ArrayList<>();
        new StringPermutation1().permutate("", "ABC", result);
        System.out.println(result);
        System.out.println(Factorial.factorial(4));

    }

    private StringPermutation1 () {
    }

    private void permutate(String prefix, String subfix, List<String> perms) {

        if (subfix.isEmpty()) {
            perms.add(prefix);
        } else {
            for(int charIndex = 0; charIndex < subfix.length(); charIndex++) {
               final String newChar = Character.toString(subfix.charAt(charIndex));
               final String newSubfix = subfix.substring(0, charIndex) + subfix.substring(charIndex + 1);
               permutate(prefix + newChar, newSubfix, perms);
            }
        }
    }
}
