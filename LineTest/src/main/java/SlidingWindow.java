import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindow {
    public static void main(final String[] args) {
        final int[] solution = solution(2, new int[]{2, 1, 2, -1, 3});
    }

    public static int[] solution(final int windowSize, final int[] numbers) {

        final ArrayList<Integer> solution = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            final int[] subarray = Arrays.copyOfRange(numbers, i, (i + windowSize));
            solution.add(Arrays.stream(subarray).sorted().toArray()[windowSize - 1]);
        }

        return solution.stream().mapToInt(i -> i).toArray();
    }
}