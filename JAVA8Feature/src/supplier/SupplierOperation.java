package supplier;

import model.Employee;

import java.util.function.Supplier;

public class SupplierOperation {
    public static void main(String[] args) {
        Supplier<Employee>  s = () ->
        {
            Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
            System.out.println(" name is" +e1.getName());
            System.out.println(" Salary is" +e1.getSalary());
            return e1;
        };
        s.get();
    }
}
