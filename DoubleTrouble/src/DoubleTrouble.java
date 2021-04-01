import java.util.ArrayList;
import java.util.List;

public class DoubleTrouble {

    public static void main(String[] args) {

        List<String> people = new ArrayList<>();
        people.add("Sheldon");
        people.add("Leonard");
        people.add("Penny");
        people.add("Rajesh");
        people.add("Howard");

        System.out.println(doubleTrouble(people, Integer.MAX_VALUE));

    }

    static String doubleTrouble(List<String> queue, int n) {

        for (int i = 0; i < n; i++) {
            String first = queue.iterator().next();
            String person = queue.get(queue.indexOf(first));
            queue.add(person);
            queue.add(person);
            queue.remove(first);

        }

        System.out.println(queue.toString());
        return queue.get(queue.size() - 1);
    }

}
