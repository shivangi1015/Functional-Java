import java.util.HashMap;
import java.util.Map;

public class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        System.out.println(f);
        int count = 0;
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        for(int element: a) {
            if(elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        for(HashMap.Entry hm: elementCountMap.entrySet()) {
            if(((int)hm.getValue()) >= f) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        countSpecials(new int[]{1, 4, 1, 4, 4, 1, 1, 4}, 6, 2);
    }
}
