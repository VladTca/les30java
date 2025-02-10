import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flyble> flybles = new ArrayList<>();
        flybles.add(new Duck(1, 2, 3));
        flybles.add(new Aerostat());
        flybles.add(new Aircraft());
        flybles.add(new Bird(4, 5, 6));


       flybles.forEach(Flyble::fly);
    }
}