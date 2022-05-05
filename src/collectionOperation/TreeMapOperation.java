package collectionOperation;

import compare.SortByAge;
import compare.SortBySalary;
import model.Employee;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapOperation {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> treeMap = new TreeMap<>(new SortByAge());
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2=new Employee(2, "Mansi",24, " m@gmail.com ", "Female" , "IT", 25000);
        Employee e3=new Employee(3, "Akash",29, " k@gmail.com ", "Male" , "IT", 32000);
        Employee e4=new Employee(3, "Akash",22, " k@gmail.com ", "Male" , "IT", 32000);
        treeMap.put(e1,1);
        treeMap.put(e2,2);
        treeMap.put(e3,3);
        treeMap.put(e4,4);
        for (Map.Entry<Employee,Integer> entry: treeMap.entrySet()) {
            treeMap.remove(e1);
            System.out.println("Key is=>"+entry.getKey()+" value is=>"+entry.getValue());
        }


    }
}
