

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Step 1: sort string
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            // Step 2: store in map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        // Step 3: return result
        return new ArrayList<>(map.values());
    }
}