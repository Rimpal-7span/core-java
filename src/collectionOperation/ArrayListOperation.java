package collectionOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import compare.SortBySalary;
import model.Employee;
import Data.EmployeeData;

public class ArrayListOperation {
    public static void main(String[] args) {
        Employee e5=new Employee(5, "meera",29, " z@gmail.com ", "Female" , "IT", 15000);
        List<Employee> empList = EmployeeData.empData();
        List<Employee> empListCopy = new ArrayList<>();
        empListCopy.addAll(empList);
        Collections.sort(empListCopy, new SortBySalary());

       /* for (Employee emp: empListCopy) {
             System.out.println(emp);
        }*/

        List<Employee> listCopy = new CopyOnWriteArrayList(empListCopy);
        Iterator<Employee> listIterator = listCopy.iterator();

        while (listIterator.hasNext())
        {

            System.out.println(listIterator.next());
            listCopy.add(e5);
        }
        System.out.println();

    }

}
