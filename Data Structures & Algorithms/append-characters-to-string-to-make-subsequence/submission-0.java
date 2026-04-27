class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++; // match found
            }
            i++;
        }

        // remaining characters in t need to be appended
        return t.length() - j;
    }
}