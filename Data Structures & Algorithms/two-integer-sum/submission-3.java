class Solution {
    public int[] twoSum(int[] nums, int target) {

        // hashmap me number ko key aur uska index value ke form me store karenge
        HashMap<Integer, Integer> map = new HashMap<>();

        // poore array ko traverse karenge
        for(int i = 0; i < nums.length; i++) {

            // current number ke saath target banane ke liye jo number chahiye
            int res = target - nums[i];

            // check karenge ki required number pehle hashmap me mila hai ya nahi
            if(map.containsKey(res)) {

                // required number ka index aur current number ka index return karenge
                return new int[]{map.get(res), i};
            }

            // current number ko key aur uske index ko value bana kar hashmap me store karenge
            map.put(nums[i], i);
        }

        // agar koi pair nahi mila toh empty array return karenge
        return new int[]{};
    }
}