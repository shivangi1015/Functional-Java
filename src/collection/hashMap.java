package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class hashMap {

    public static Boolean checkParenthesis(String paren) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < paren.length(); i++) {
            if(paren.charAt(i) == '{' | paren.charAt(i) == '(' | paren.charAt(i) == '[') {
                stack.push(paren.charAt(i));
            } else if(paren.charAt(i) == '}' | paren.charAt(i) == ')' | paren.charAt(i) == ']') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(checkParenthesis(""));

      /*  Map<String, String> mapValue = new HashMap<>();
        mapValue.put("k1",  "v1");
        mapValue.put("k2",  "v2");
        mapValue.put("k3",  "v3");
        mapValue.put("k4",  "v4");
        mapValue.put(null, null);
        mapValue.put("k4", "v5");

        System.out.println(mapValue);*/
     /*   System.out.println(mapValue.containsKey("k1"));
        System.out.println(mapValue.containsKey("k6"));
        System.out.println(mapValue.containsValue("k6"));
        System.out.println(mapValue.containsValue("v5"));
        System.out.println(mapValue.entrySet());*/

//     mapValue.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
     /*   Set<String> strings = mapValue.keySet();
        strings.forEach(keys -> System.out.println(keys));*/
        /*
        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();*/

       /* Integer[] arr =  {3,2,5,1,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



*/


    }
}
