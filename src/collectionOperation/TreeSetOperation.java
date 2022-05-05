package collectionOperation;

import Data.EmployeeData;
import compare.SortByName;
import model.Employee;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetOperation {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2=new Employee(2, "Reema",24, " m@gmail.com ", "Female" , "IT", 25000);
        Employee e3=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        Employee e4=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        TreeSet<Employee> list = new TreeSet<>(new SortByName());
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        //use of iterator
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }



    }
}
