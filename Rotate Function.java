class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long candidate = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            candidate += i * nums[i];
        }

        long max = candidate;

        for (int i = n - 1; i >= 1; i--) {
            candidate = candidate + sum - n * nums[i];
            max = Math.max(max, candidate);
        }

        return (int) max;
    }
}
