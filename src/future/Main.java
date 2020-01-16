package future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<String> products = new ArrayList<>();
        products.add("prod1");

        String first = null;
        String second = null;
        String third = null;
        List<String> collect = products.stream().limit(3).collect(Collectors.toList());

        if(collect.size() > 0) {
            first = collect.get(0);
        } else if(collect.size() > 1) {
            first = collect.get(0);
            second = collect.get(1);
        } else if(collect.size() > 2) {
            first = collect.get(0);
            second = collect.get(1);
            third = collect.get(2);
        }

        StringBuilder s = new StringBuilder("hello");
        /*s.reverse();
        System.out.println(s);*/

        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

       /* rev.substring(0);

        System.out.println(rev);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        CompletableFuture<String> f = new CompletableFuture<>();
        f = CompletableFuture.completedFuture("==");
        System.out.println(f.get());*/
//        f.thenRun();

        /*List<Integer> l = Arrays.asList(2,1,3,5,4);
        List<Integer> list = l.stream().sorted().collect(Collectors.toList());
        System.out.println(list.get(list.size() - 2));*/
//        System.out.println(l);
       /* float a = 5.43f;
        float b = 2.653f;
        float result = a/b;
        System.out.println((String.format("%.5f", result) + " " + (String.format("%.3f", result))));
        System.out.println(result);*/
        String A="java";
        String B="hello";
//        System.out.println(A.length() + B.length());
//        System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");
//        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));

//        System.out.println(A.substring(0, 3));
        String str = "welcometojava";
        List<String> ls = new ArrayList<>();
        for(int i = 0 ; i< str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                ls.add(str.substring(i, j));
            }
        }

        List<String> stringList = ls.stream().filter(v -> v.length() == 3).collect(Collectors.toList());
        List<String> sortedStringList = ls.stream().filter(v -> v.length() == 3).sorted().collect(Collectors.toList());
        List<String> sortedList = ls.stream().filter(ele -> ele.length() == 3).sorted().collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println(sortedStringList.get(0));
        System.out.println(sortedStringList.get(sortedStringList.size() - 1));
    }
}
