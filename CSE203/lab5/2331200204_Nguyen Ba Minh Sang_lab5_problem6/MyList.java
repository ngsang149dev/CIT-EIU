package CSE203.lab5.p6;

import java.util.ArrayList;

public class MyList<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();
    
    public void add(T element) {
        list.add(element);
    }

    public T largest() {
        T max = list.get(0);
        for (int i = 0; i < list.size();i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public T smallest() {
        T min = list.get(0);
        for (int i = 0; i < list.size();i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
        return min;
    }

}
