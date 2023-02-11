import java.util.ArrayList;

public class PilaArreglos<T> {
    private ArrayList<T> stack = new ArrayList<T>();
    private int size = 0;

    public void push(T data) {
        stack.add(data);
        size++;
    }

    public void pop() {
        if(!isEmpty()) {
            stack.remove(size - 1);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while(!isEmpty()) {
            pop();
        }
    }

    public T top() {
        if(isEmpty()) {
            return null;
        }
        else {
            return stack.get(size - 1);
        }
    }
    /* 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(T aux: stack) {
            sb.append(aux);
            if() {

            }
            sb.append(", ");
        }
        sb.append(" ]");
        return sb.toString();
    }
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("] ");
        for(T aux: stack) {
            sb.append(aux + ", ");
        }
        if(sb.length() > 0){
            sb.deleteCharAt(sb.length() - 2);
        }
        sb.append("[");
        sb.reverse();
        return sb.toString();
    }
        
}
