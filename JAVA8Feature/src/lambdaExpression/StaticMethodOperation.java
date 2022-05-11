package lambdaExpression;
interface s
{
    static void display()
    {
        System.out.println("s display ");
    }

    static void display1()
    {
        System.out.println("s display1 ");
    }
}


interface s1
{
    static void display()
    {
        System.out.println("s1 display ");
    }

    static void display1()
    {
        System.out.println("s1 display1 ");
    }
}
public class StaticMethodOperation implements s,s1 {
    public static void main(String[] args) {


    }
}
