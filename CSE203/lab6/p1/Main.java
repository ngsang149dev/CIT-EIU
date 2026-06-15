package lab6.p1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 6));
        shapes.add(new Rectangle(5, 8));
        shapes.add(new Square( 36));

        shapes.forEach(s -> s.draw());
    }
}
