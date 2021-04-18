import java.util.ArrayList;
import java.util.Arrays;

public class Sticks {

    public static void main(final String[] args) {
        final int[] solution = solution(new int[]{1, 2, 3, 4}, 7);
    }

    public static int[] solution(final int[] numbers, final int target) {
        final ArrayList<int[]> solution = new ArrayList<>();
        final int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();

        for (int i = 0; i < sortedNumbers.length; i++)
            for (int j = i + 1; j < sortedNumbers.length; j++)
                if ((sortedNumbers[i] + sortedNumbers[j]) == target)
                    solution.add(new int[]{sortedNumbers[i], sortedNumbers[j]});

        return solution.get(0);
    }
}
