package lambdaExpression;

public class RunnableInterfaceImplementation {
    public static void main(String[] args) {
    Runnable r = () -> {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(" child thread");

        }};
    Thread t =new Thread(r);
   t.run();
        for (int i = 0; i < 5 ; i++) {
            System.out.println(" main thread");

        }
    }
}
