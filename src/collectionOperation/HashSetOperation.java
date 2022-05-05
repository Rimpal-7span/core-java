package collectionOperation;

import Data.EmployeeData;
import compare.SortBySalary;
import model.Employee;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {

    public static void main(String[] args) {
        HashSet<Employee> list = new HashSet<>(EmployeeData.empData());
        //use of iterator
        Iterator<Employee>itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }

}
