package ico.fes.aragon.unam.inicio;

import java.util.ArrayList;
import java.util.LinkedList;

public class PilaADT<E> {
    private ArrayList<Object> data;

    public PilaADT() {
        data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public int length() {
        return data.size();
    }

    public Object pop() {
        if (!isEmpty()) {
            return data.remove(data.size() - 1);
        }
        return null;
    }

    public Object peek() {
        if (!isEmpty()) {
            return data.get(data.size() - 1);
        }
        return null;
    }

    public void push(Object value) {
        data.add(value);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("-----\n");
        for (int i = data.size() - 1; i >= 0; i--) {
            info.append(data.get(i)).append("\n|---|\n");
        }
        return info.toString();
    }
}
