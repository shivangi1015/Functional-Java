package difference;

abstract class Vehicle {
    private int id;
    public abstract void land();
}
interface MyInterface {
    int id = 0;
    default void takeOff() {
        System.out.println("MyInterface::takeOff");
    }

}
public class Diff {
    public static void main(String[] args) {
        int id = MyInterface.id;
        System.out.println(id);
        System.out.println("OK!");
        String s = "hello I am";
        String s1 = s.replaceAll(" ", "");
        System.out.println(s1);
    }
}
