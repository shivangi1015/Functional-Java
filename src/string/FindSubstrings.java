package string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindSubstrings {
    static List<String> subStrings(String str) {
        List<String> subs = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j < str.length(); j++) {
                subs.add(str.substring(i, j));
            }
        }
        return subs.stream().filter(l -> l.length() == 3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(subStrings("hello"));
    }
}
