package structures_;

import structures_.Stack;

public class Queue {

    Stack input = new Stack();
    Stack output = new Stack();

    public void offer(Integer i) {
        input.push(i);
    }

    public Integer poll() {
        Integer i = output.pop();
        if (i != null) {
            return i;
        } else {
            Integer j = input.pop();
            while (j != null) {
                output.push(j);
                j = input.pop();
            }
            return output.pop();
        }
    }



}
