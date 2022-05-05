package collectionOperation;

import model.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperation {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2=new Employee(2, "Mansi",24, " m@gmail.com ", "Female" , "IT", 25000);
        Employee e3=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        Employee e4=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);

        HashMap<Integer, Employee> hashMapList = new HashMap<>();
        hashMapList.put(1,e1);
        hashMapList.put(2,e2);
       //primitive type as key
        System.out.println("Using Primitive Type as key=================>");
        for(Map.Entry m : hashMapList.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //object as key
        System.out.println("Using Object as key=================>");
        HashMap<Employee,String> objectHashMapList = new HashMap<>();
        objectHashMapList.put(e3,e3.getName());
        objectHashMapList.put(e4,e4.getName());
            for(Map.Entry m : objectHashMapList.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
    }
}
