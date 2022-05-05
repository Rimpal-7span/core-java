package collectionOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import compare.SortBySalary;
import model.Employee;
import Data.EmployeeData;

public class ArrayListOperation {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeData.empData();
        List<Employee> empListCopy = new ArrayList<>();
        empListCopy.addAll(empList);
        Collections.sort(empListCopy, new SortBySalary());

        for (Employee emp: empListCopy) {
             System.out.println(emp);
        }
    }

}
