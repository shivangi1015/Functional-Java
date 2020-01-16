package geeks;

public class PatternMatcher {
    static void follPatt(String s) {

        //Your code here

        for (int i = 0; i < s.length(); i++) {
            int x = 0;
            int y = 0;
            if (s.charAt(i) == 'x') {
                x++;
                while (s.charAt(i) == 'x') {
                    System.out.println("=");
                    x++;
                }
            } else if (s.charAt(i) == 'y') {
                while (s.charAt(i) == 'y') {
                    y++;
                }
            }

            if(x !=y) {
                System.out.println("1");
                break;
            }
        }

        System.out.println("0");
    }

    public static void main(String[] args) {
        follPatt("xyyx");
    }
}
