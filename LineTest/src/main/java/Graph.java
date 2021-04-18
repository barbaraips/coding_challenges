public class Graph {

    public static void main(final String[] args) {
        final Boolean solution = solution(3, new int[]{0, 1, 1, 2, 2, 0});
    }

    public static Boolean solution(final int size, final int[] edges) {

        if (edges.length > 0) {
            for (final int node : edges) {
                if (edges[node] + 1 != edges[node + 2]) {
                    return false;
                }
            }
            return edges[0] == edges[edges.length - 1];
        }
        return false;
    }
}
