public class Main {

    public static void main(String[] args) {
        
            int i = 0, j = 9;
            do {
                i++;
                System.out.println("i: " + i);
                System.out.println("j: " + j);
                if (j-- < i++) {
                    System.out.println("---" + i + "" + j);
                    break;
                }
            } while (i < 5);
            System.out.println(i + "" + j);
    }
}

interface i1{}
interface i2{}

class myclass implements i1, i2 {

}