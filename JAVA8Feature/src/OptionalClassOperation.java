import model.Employee;

import java.util.Optional;

public class OptionalClassOperation {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2 = null;
        Optional<Employee> check = Optional.ofNullable(e2);
       if(check.isPresent())
       {
           System.out.println(e2.getSalary());
       }
       else
       {
           System.out.println(" null");
       }

    }
}
