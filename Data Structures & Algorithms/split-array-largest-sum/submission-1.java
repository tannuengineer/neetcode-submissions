class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0;

        for (int num : nums) {
            start = Math.max(start, num); // max element
            end += num; // total sum
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1; // need bigger sum
            } else {
                end = mid; // try smaller
            }
        }

        return start;
    }
}