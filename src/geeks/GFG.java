package geeks;

import java.util.Arrays;

/*
The first line of input contains T, denoting the number of testcases. First line of every test case consists of N,
 denoting number of elements in an array. Second line of every testcase consists of elements in an array separated by space.
 */
public class GFG {

    public static int[] formatArray(int[] a,int n)
    {
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0 && i+1 <= n-1){
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        return a;
    }

    static void swapElements(int a[], int n){

        for(int i = 0; i < n-2; i++) {
            //swap every ith element of the array with (i+2)th element
            int temp = a[i+2];
            a[i+2] = a[i];
            a[i] = temp;
        }

        System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        int[] a ={4,3,2,1};
        int[] ints = formatArray(a, 4);
        System.out.println(Arrays.toString(ints));
    }
}
