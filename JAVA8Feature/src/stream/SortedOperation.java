package stream;

import model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedOperation {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2=new Employee(2, "Reema",24, " m@gmail.com ", "Female" , "IT", 25000);
        Employee e3=new Employee(3, "Akash",28, " k@gmail.com ", "Male" , "IT", 32000);
        Employee e4=new Employee(3, "Akash",26, " k@gmail.com ", "Male" , "IT", 32000);
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
       // list.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);
          list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
    }

}
