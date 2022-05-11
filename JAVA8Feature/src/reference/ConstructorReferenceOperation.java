package reference;
interface  interfaceDemo
{
    test display();
}
class test
{
    test()
    {
        System.out.println(" this is constructor of test class");
    }
}
public class ConstructorReferenceOperation {
    public static void main(String[] args) {
        interfaceDemo i = test::new;
        i.display();

    }
}
