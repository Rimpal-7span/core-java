package predicate;

import java.util.function.Predicate;

public class PredicateOperation {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i>50;
        System.out.println(p.test(100));
        System.out.println(p.test(5));

        Predicate<String> q = s -> s.length()!= 0;
        System.out.println(q.test(""));
        System.out.println(q.test(" hi"));
    }
}
