class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int rightMax = -1;

        for(int i = n - 1; i >= 0; i--){

            int temp = arr[i];   // store current
            arr[i] = rightMax;  // replace

            rightMax = Math.max(rightMax, temp);
        }

        return arr;
    }
}