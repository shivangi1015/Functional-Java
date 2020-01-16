package queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CreatePriorityQueue {

    static void follPatt(String s)
    {

        //Your code here
        int x = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'x') {
                ++x;
            }
            else if(s.charAt(i) == 'y'){
                ++y;
            }
        }

        if(x == y)
            System.out.println(1);
        else
            System.out.println(0);
    }

    static void countSumSubsets(int arr[],int n)
    {
        for(int i = 0; i < n; i++) {
            int sum = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                al.add(arr[j]);
            }
            System.out.println(al);
        }
        //Your code here
    }

    public static void main(String[] args) {
        // Add items to a Priority Queue (ENQUEUE)
        int[] strArr = {1,2,3};
        countSumSubsets(strArr, 3);
        ArrayList<String> al = new ArrayList<>();
       /* al.add("b");
        al.add("a");
        al.add("d");
        al.add("c");
//        Collections.sort(al);
        al.sort((a,b) -> a.compareTo(b));
//        System.out.println(al);
        int b[] = new int[10];

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));
        int i = arr[0] ^ 1;/*/

//       follPatt("xyyx");
    }



}
