package functionalInterface;
interface  First {
    default void show() {
        System.out.println(" First interface");
    }

    interface Second {
        default void show() {

            System.out.println(" default interface");
        }
        default void show1(){
            System.out.println(" default1 interface");
        }

    }

    public class DefaultMethodOperation implements First, Second {

        @Override
        public void show() {
            First.super.show();
            Second.super.show();
            Second.super.show1();
            //System.out.println(" Classs show method");
        }

        public static void main(String[] args) {
            DefaultMethodOperation d = new DefaultMethodOperation();
            d.show();
        }
    }
}
