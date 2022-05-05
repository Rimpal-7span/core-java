package collectionOperation;

import Data.EmployeeData;
import model.Employee;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOperation {
    public static void main(String[] args) {
        Employee e4=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        LinkedHashSet<Employee> list = new LinkedHashSet<>(EmployeeData.empData());
        //use of iterator
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        if(list.contains(e4))
        {
            System.out.println(" yes it contains");
        }
        else {
            System.out.println(" No it contains Not");
        }

    }

}
