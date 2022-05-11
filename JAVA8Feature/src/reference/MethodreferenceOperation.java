package reference;

interface  inter
{
    void display();
}
class Implementation
{
    void show()
    {
        System.out.println(" this is method from show");
    }
}
public class MethodreferenceOperation {

    public static void main(String[] args) {
        Implementation im= new Implementation();
        inter i = im ::show;
        i.display();
    }
}
