class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // max pile find karo
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                ans = mid;
                high = mid - 1; // try smaller k
            } else {
                low = mid + 1; // increase k
            }
        }

        return ans;
    }

    private boolean canEat(int[] piles, int h, int k) {
        int hours = 0;

        for (int pile : piles) {
            // ceil(pile / k)
            hours += (pile + k - 1) / k;
        }

        return hours <= h;
    }
}