package structures;

public class Queue {

    Stack input = new Stack();
    Stack output = new Stack();

    public void offer(Integer i) {
        input.push(i);
    }

    public Integer poll() {
        Integer i = output.pop();
        if (i == null) {
            Integer j;
            while ((j = input.pop()) != null) {
                output.push(j);
            }
            i = output.pop();
        }
        return i;
    }
}
