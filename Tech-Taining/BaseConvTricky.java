class Solution {
    public int[] productQueries(int n, int[][] q) {
        int mod = 1000000007;

        ArrayList<Integer> arr = new ArrayList<>();
        int copy = n; // keep original n safe for later

        // Step 1: Convert n to binary bits
        while (copy > 0) {
            int rem = copy % 2;
            arr.add(rem);
            copy /= 2;
        }

        // Step 2: Build list of powers of two from binary representation
        ArrayList<Integer> power = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                power.add(1 << i); // 2^i
            }
        }

        // Step 3: Process queries
        int[] ans = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            long temp = 1; // must be long to avoid overflow
            for (int j = q[i][0]; j <= q[i][1]; j++) {
                temp = (temp * power.get(j)) % mod;
            }
            ans[i] = (int) temp;
        }
        return ans;
    }
}
