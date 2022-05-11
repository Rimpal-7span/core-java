package staticMember;

class Bike {
    public  void run()     {
        System.out.println(" Bike well be started");
    }
}
class Honda extends Bike {
    public void run()     {
        System.out.println("Honda Bike well be started");
    }
}
public class Overriding {
    public static void main(String[] args)      {
        Bike b=new Honda();
        b.run();
    }
}
