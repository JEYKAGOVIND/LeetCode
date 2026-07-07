class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] incoming = new int[n + 1];
        int[] outgoing = new int[n + 1];

        // Count incoming and outgoing trusts
        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];

            outgoing[a]++;
            incoming[b]++;
        }

        // Find the judge
        for (int i = 1; i <= n; i++) {
            if (incoming[i] == n - 1 && outgoing[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}