package collectionOperation;
import model.Employee;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapOperation extends Thread{
  static ConcurrentHashMap<Employee,String> concurrentHashMap = new ConcurrentHashMap<>();
  Employee e4=new Employee(4, "meera",29, " z@gmail.com ", "Female" , "IT", 21000);
    @Override
    public void run() {
        concurrentHashMap.put(e4,e4.getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Employee e1=new Employee(1, "Manisha",27, " a@gmail.com ", "Male" , "IT", 35000);
        Employee e2=new Employee(2, "Mansi",24, " m@gmail.com ", "Female" , "IT", 25000);
        ConcurrentHashMapOperation cp= new ConcurrentHashMapOperation();
        cp.start();
        Employee e3=new Employee(3, "Akash",24, " k@gmail.com ", "Male" , "IT", 32000);
        concurrentHashMap.put(e1,e1.getName());
        concurrentHashMap.put(e2,e2.getName());
        for(Map.Entry m : concurrentHashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
            concurrentHashMap.put(e3,e3.getName());
            Thread.sleep(2000);
        }
        System.out.println(concurrentHashMap.entrySet());
    }
}
