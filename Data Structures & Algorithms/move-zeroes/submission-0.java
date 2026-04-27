public class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                tmp.add(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < tmp.size()) {
                nums[i] = tmp.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }
}