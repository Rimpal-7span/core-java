package lambdaExpression;
interface inter
{
    void add(int a, int b);
}
public class LambdaExpressionOperation {
    public static void main(String[] args) {

        inter i = (a,b) -> System.out.println(" result is=>"+(a+b));
        i.add(10,20);
    }
}
