package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * #Example 1: a1 = ["arp", "live", "strong"]

 a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

 returns ["arp", "live", "strong"]

 #Example 2: a1 = ["tarp", "mice", "bull"]

 a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

 returns []
 */
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> result = new ArrayList<>();

        for (String anArray1 : array1) {
            for (String anArray2: array2) {
                if (anArray2.contains(anArray1)) {
                    result.add(anArray1);
                    break;
                }
            }
        }

        Collections.sort(result);
        System.out.println(result);
        String[] s = new String[result.size()];
        return result.toArray(s);

       /* return Arrays.stream(array1)
                .filter(str ->
                        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);*/
    }

    public static String rev(String s) {
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }

    public static String isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                System.out.println("inside if");
                stack.push(s.charAt(i));
            } else if(!stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                System.out.println("inside else");
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            return "valid";
        } else {
            return "invalid";
        }
    }
    public static String toJadenCase(String phrase) {

        /*if(phrase != null && !phrase.isEmpty()) {
            String capitalizeWord = "";
            for(String s: phrase.split(" ")) {
                String firstWord = s.substring(0,1);
                String restWord = s.substring(1);
                capitalizeWord += firstWord.toUpperCase() + restWord + " ";
            }
            return capitalizeWord.trim();
        }

        return null;*/

        if(phrase == null || phrase.isEmpty()){
            return null;
        }

        return Arrays.stream(phrase.split(" ")).map(i -> i.substring(0,1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static int findSmallestInt(int[] args) {

        int min = args[0];
        for(int element: args) {
            if(element < min)
                min = element;
        }
        return min;
    }

    public static String getMiddle(String word) {
        if(word.length() == 1){
            return word;
        }

        int half = word.length() / 2;

        if(word.length() % 2 == 0) {
            return word.substring(half - 1, half + 1);
        } else {
            return word.substring(half + 1);
        }
    }

    /*

    1 * (2 + 3) = 5
    1 * 2 * 3 = 6
    1 + 2 * 3 = 7
    (1 + 2) * 3 = 9

     */
    public static int expressionsMatter(int a, int b, int c)
    {
        int one = a * (b + c);
        int two = a * (b * c);
        int three = a + b * c;
        int four = (a + b) * c;

        int[] arr = {one, two, three, four};
        for (int i : arr) {
            System.out.println(i);
        }
        int max = one;
        for(int ar : arr) {
         if(ar > max){
             max = ar;
         }
        }
        return max;
    }


    public static void main(String[] args) {
        /*String a[] = new String[]{ "arp", "strong" , "live"};
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] result = inArray(a, b);
        System.out.println(result);
        System.out.println(rev("hello"));*/
//        System.out.println(isValid("()"));
//        System.out.println(toJadenCase("most trees are blue"));
        /*System.out.println(Integer.MIN_VALUE);
        System.out.println(findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE}));*/
//        System.out.println(getMiddle("m"));
        /*System.out.println(expressionsMatter(1,3,1));
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread : " + Thread.currentThread());
            }
        });

        Thread th1 = new Thread(() -> System.out.println("thread : " + Thread.currentThread()));
        th.start();
        th1.start();
        System.out.println("=== " + Thread.currentThread());*//*
        Consumer<Integer> consumer = (Integer value) -> System.out.println(value);
        consumer.accept(2);
        List<Integer> list = Arrays.asList(1,2,3);
        list.forEach(value -> System.out.println(value));*/

        /*Supplier<Integer> supplier = () -> 2;
        supplier.get();*/
        List<String> names = Arrays.asList("Jill", "Jack");
        System.out.println(names.stream().filter(value -> value.length() == 4).findFirst().orElse("None"));
    }
}
//Collections.sort(result);
