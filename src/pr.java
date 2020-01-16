import java.util.Optional;

public class pr {
    public static void main(String[] args) {
        Optional<Boolean> bool = Optional.of(false);

        Boolean aBoolean = bool.orElseThrow(() -> new NullPointerException(""));
        System.out.println(aBoolean);
    }
}
