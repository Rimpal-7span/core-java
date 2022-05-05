package collectionOperation;

import model.Employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapOperation {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2=new Employee(2, "Mansi",24, " m@gmail.com ", "Female" , "IT", 25000);
        Employee e3=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        Employee e4=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        LinkedHashMap<Integer,Employee> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,e1);
        linkedHashMap.put(3,e3);
        linkedHashMap.put(3,e4);
        for (Map.Entry<Integer,Employee> entry: linkedHashMap.entrySet()) {
            System.out.println(" key is=>"+entry.getKey()+ " "+ " value is==>"+ entry.getValue());
        }
        System.out.println("get entry set=========>"+linkedHashMap.entrySet());
        System.out.println("values of first key=========>"+linkedHashMap.get(1));
        System.out.println("values =========>"+linkedHashMap.values());
        System.out.println("Contain value=========>"+linkedHashMap.containsValue(e4));

    }
}
