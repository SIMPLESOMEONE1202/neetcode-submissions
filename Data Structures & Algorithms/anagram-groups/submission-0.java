class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // hashmap me sorted string ko key aur uske anagrams ki list ko value rakhenge
        HashMap<String, List<String>> map = new HashMap<>();

        // array ke har string ko traverse karenge
        for (int i = 0; i < strs.length; i++) {

            // current string ko character array me convert karenge
            char[] arr = strs[i].toCharArray();

            // character array ko sort karenge taaki saare anagrams ki same key bane
            Arrays.sort(arr);

            // sorted character array ko wapas string me convert karenge
            String key = new String(arr);

            // agar ye sorted key pehli baar mili hai toh new empty list banayenge
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // current original string ko uski corresponding anagram list me add karenge
            map.get(key).add(strs[i]);
        }

        // hashmap ki saari lists ko ek final list me convert karke return karenge
        return new ArrayList<>(map.values());
    }
}