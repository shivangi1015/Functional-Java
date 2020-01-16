package geeks;

import java.util.HashMap;
import java.util.Map;

public class MatrixColumn {
    /*
    Working with 2D arrays is quite important. Here we will do swapping of
     column in a 2D array. You are given a matrix M or r rows and c columns.
     You need to swap the first column with the last column.
     */
    static void interchange(int a[][],int r, int c){

        // Your code here
        //swap the first column with the last column
        for(int i = 0; i < r; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][c-1];
            a[i][c-1] = temp;
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
    static int coutChars(String s1, String s2)
    {
        /*
    Input:
1
madame
madam

Output:
1
    */
        int diff = 0;
        int maxLength =0;
        if(s1.length() > s2.length()){
            maxLength = s1.length();
        } else {
            maxLength = s2.length();
        }
        for(int i = 0; i < maxLength; i++) {

            if(s1.charAt(i) != s2.charAt(i))
                diff++;

        }
        return diff;
    }


    static void columnWithMaxZero(int a[][],int n) {

        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(i, 0);
            for (int j = 0; j < n; j++) {
                if (a[j][i] == 0) {
                    //increment value?
                    hm.put(i, hm.get(i)+1);
                }
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        Map.Entry<Integer, Integer> max =null;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(max == null || entry.getValue().compareTo(max.getValue()) > 0) {
                max = entry;
            }
        }

        System.out.println(max.getKey());
    }

    public static void main(String[] args) {
        int[][] a = {{1,0,0}, {1,1,0}, {1,1,0}};
        columnWithMaxZero(a, 3);
    }
}
