package predicate;

import java.util.function.Predicate;

public class PredicateOperation2 {
    public static void main(String[] args) {
        Predicate<String> p1= s-> s.contains("e");
        Predicate<String> p2 = s-> s.isEmpty();
        Predicate<String> p3 = s-> s.length()>2;
        String str= "sheela";
        System.out.println(" result of String check=>"+p1.and(p2).negate().and(p3).test(str));

    }
}
