class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // check karenge ki current number pehle hashmap me mila hai ya nahi
            if (map.containsKey(nums[i])) {

                // agar pehle se mila hai toh duplicate present hai
                return true;
            }

            // current number ko key aur uske index ko value bana kar store karenge
            map.put(nums[i], i);
        }

        // poora array traverse karne ke baad duplicate nahi mila
        return false;
    }
}


// nums = [1, 2, 3, 1]

// i = 0 → map = {}
// 1 present? NO → store 1

// map = {1=0}

// i = 1
// 2 present? NO → store 2

// map = {1=0, 2=1}

// i = 2
// 3 present? NO → store 3

// map = {1=0, 2=1, 3=2}

// i = 3
// 1 present? YES → return true