class Solution {
    public boolean isPalindrome(String s) {
         int start = 0;
        int end = s.length() - 1;

        while(start < end){

            char left = s.charAt(start);
            char right = s.charAt(end);

            // skip non-alphanumeric
            if(!Character.isLetterOrDigit(left)){
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(right)){
                end--;
                continue;
            }

            // compare (case insensitive)
            if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
