package consumer;

import model.Employee;

import java.util.function.Consumer;

public class ConsumerOperation {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Manish", 27, " a@gmail.com ", "Male", "IT", 35000);


        Consumer<Employee> c = s -> System.out.println(s.getName());
        Consumer<Employee> c1 = s -> System.out.println(s.getSalary());
        c.andThen(c1).accept(e1);
    }

}
