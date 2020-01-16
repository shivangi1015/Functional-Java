public class SingleObject {

    private SingleObject(){}

    private static SingleObject object = new SingleObject();

    public static SingleObject getInstance() {
        return object;
    }

    public void showMessage() {
        System.out.println("hello");
    }
}

