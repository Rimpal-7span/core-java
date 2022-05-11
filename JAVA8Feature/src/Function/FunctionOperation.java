package Function;

import java.util.*;
import java.util.function.Function;

import static javafx.scene.input.KeyCode.R;
import static javafx.scene.input.KeyCode.T;

public class FunctionOperation {


    public static void main(String[] args) {
        FunctionOperation fob= new FunctionOperation();
        List<String > list = Arrays.asList("one","two","three");
       Map<String ,Integer> map = fob.convertListToMap(list,s->s.length());
        System.out.println(" list is=>"+ map);


    }
        public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func)
        {
            Map<T,R> map = new HashMap<>();
            for (T t: list) {
                map.put(t, func.apply(t));
            }
            return map;

        }
    }

