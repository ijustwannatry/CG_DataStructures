package structures;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> list = new ArrayList<>();

    public Integer push(Integer i) {
        list.add(i);
        return i ;
    }

    public Integer pop() {
        if (list.size() > 0) {
            return list.remove(list.size() - 1);
        } else {
            return null;
        }
    }
}
