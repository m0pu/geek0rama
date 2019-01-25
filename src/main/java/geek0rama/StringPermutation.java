package geekorama;

import java.util.ArrayList;
import java.util.List;

// inspired from cracking the code interview.
public class StringPermutation {

    public static void main(String[] args) {
        List<String> permutations = getPermutations("abc");
        System.out.println(permutations);
    }

    private static void permute(String prefix, String subfix, List<String> permutations) {
        if (subfix.isEmpty()) {
            permutations.add(prefix);
            return;
        }

        for (int i = 0; i < subfix.length() ; i++) {
            final String tempPrefix =  subfix.charAt(i) + "";
            final String tempSubfix =  subfix.substring(0, i) + subfix.substring(i + 1);
            final String newPrefix = prefix + tempPrefix;
            permute(newPrefix, tempSubfix, permutations);
        }
    }

    private static List<String> getPermutations(String toPermute) {
        List<String> result = new ArrayList<>();
        permute("", toPermute, result);
        return result;
    }
}
