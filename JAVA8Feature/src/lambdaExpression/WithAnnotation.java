package lambdaExpression;

@FunctionalInterface
interface  Demo1
{
    String msg=" hi";
    void display( int a, int b);
    static void show(){
    //msg = "hello";
    System.out.println("Show msg"+msg);
    }

    static void show1(){
        System.out.println(" Static method show1");
    }
}

public class WithAnnotation {
    public static void main(String[] args) {

    Demo1 d= (a,b) -> {
        a=25;
        b=56;
        System.out.println(" display implementation" + a + " and" + b);
    };
    d.display(10,20);
    Demo1.show();
    Demo1.show1();
    show();
    }
    static  void show()
    {
        System.out.println(" Class Static method");
    }
}
