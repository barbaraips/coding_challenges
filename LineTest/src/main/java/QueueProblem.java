import java.util.ArrayList;
import java.util.LinkedList;

//[2, ['OFFER 1', 'OFFER Hello', 'OFFER 3', 'SIZE', 'TAKE', 'TAKE']]
public class QueueProblem {

    public String[] solution(final int capacity, final String[] commands) {

        final java.util.Queue<String> queue = new LinkedList<>();
        String[] input;
        final ArrayList<String> result = new ArrayList<>();

        for (final String command : commands) {
            input = command.split(" ");
            if ("OFFER".equals(input[0])) if (queue.size() < capacity) {
                queue.add(input[1]);
                result.add("true");
            } else result.add("false");
            else if ("TAKE".equals(input[0])) {
                if (!queue.isEmpty()) result.add(queue.poll());
            } else if ("SIZE".equals(input[0])) result.add(String.valueOf(queue.size()));
        }
        return result.toArray(new String[0]);
    }

}
