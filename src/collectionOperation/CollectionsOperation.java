package collectionOperation;

import Data.EmployeeData;
import model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsOperation {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeData.empData();
        List<Employee> empListCopy = new ArrayList<>();
        Employee e5=new Employee(5, "mahima",29, " z@gmail.com ", "Female" , "IT", 28000);
        Employee e6=new Employee(6, "Kiran",29, " z@gmail.com ", "Female" , "IT", 29000);
        empListCopy.add(e5);
        System.out.println("Before addall===>");
        System.out.println(empList);

        //add all element of list
        Collections.addAll(empList,e5,e6);
        System.out.println("After addall===>");
        System.out.println(empList);

        //searching Collection
        System.out.println(" Binary search===>"+Collections.binarySearch(empList,e5));

        //Copying list
        Collections.copy(empList,empListCopy);
        System.out.println("After copying===>");
        System.out.println(empList);


    }
}
