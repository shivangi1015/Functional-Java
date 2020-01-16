package geeks;

public class Largest {

    public static void maxElement(int[] arr) {
        int max = arr[0];
        for(int element: arr) {
            if(element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
    public static void main (String[] args) {
        int[] aa = {2,3,5,1,9,7};
        maxElement(aa);


    }
}
