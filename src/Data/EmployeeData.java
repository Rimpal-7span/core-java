package Data;

import model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EmployeeData {
    public EmployeeData()
    {

    }
    public static List<Employee> empData()
    {
        List<Employee> list = new ArrayList<>();
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2=new Employee(2, "Mansi",24, " m@gmail.com ", "Female" , "IT", 25000);
        Employee e3=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        Employee e4=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        return list;
    }
}
