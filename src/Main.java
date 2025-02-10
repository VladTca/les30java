import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Flyble> flybles = new ArrayList<>();
        flybles.add(new Duck(1, 2, 3));
        flybles.add(new Aerostat());
        flybles.add(new Aircraft());
        flybles.add(new Bird(4, 5, 6));


//       flybles.forEach(Flyble::fly);
        ListIterator <Flyble> ls = flybles.listIterator();
        while (ls.hasNext()) {
            ls.next().fly();
        }
    }
}