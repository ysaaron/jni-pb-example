/**
 * Created by aaron on 2017/4/7.
 */
public class Main {
    private native void sayHello();

    static {
        System.load(System.getProperty("java.library.path") + "/Main.so");
    }

    public static void main(String[] args) {
        new Main().sayHello();
    }
}
