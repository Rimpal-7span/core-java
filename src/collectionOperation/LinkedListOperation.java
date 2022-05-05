package collectionOperation;

import Data.EmployeeData;
import compare.SortByName;
import compare.SortBySalary;
import model.Employee;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<Employee> empLinkedList = new LinkedList<>(EmployeeData.empData());
        Collections.sort(empLinkedList,new SortBySalary());

       //sorted list
        for (Employee emp: empLinkedList) {
            System.out.println(emp);
        }
        //get first element from list
        System.out.println( empLinkedList.getFirst());

        //remove last element from list
        empLinkedList.pollLast();
        System.out.println( empLinkedList);

    }

}
