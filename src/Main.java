import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();

        singletonInstance.showMessage();
    }
}