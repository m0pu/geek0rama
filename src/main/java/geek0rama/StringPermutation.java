package geekogeek;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {
        final ArrayList<String> permutations = new ArrayList<>();
        new StringPermutation().permute("", "abc",  permutations);

        System.out.println(permutations);
    }

    StringPermutation() {
        // UNIMPLEMENTED
    }

    private void permute(String prefix, String subfix, List<String> permutations) {
        if (subfix.isEmpty()) {
            permutations.add(prefix);
        }
        for (int i = 0; i < subfix.length() ; i++) {
            final String tempPrefix =  subfix.charAt(i) + "";
            final String tempSubfix =  subfix.substring(0, i) + subfix.substring(i + 1);
            final String newPrefix = prefix + tempPrefix;
            permute(newPrefix, tempSubfix, permutations);
        }
    }
}
