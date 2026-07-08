class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            int res = target - nums[i];   //harr ek position pe ek hashvalue insert karne ke liye plus uske baad taaki last me check hojaye


            if(map.containsKey(res)){
                return new int[]{map.get(res), i};//idhar actual answer jab agar key hai toh uske baad jidhar mila tha difference and uska key
            }

            map.put(nums[i], i);//ye daalne ke liye new change value(abhi latest aage se found position)
        }

        return new int[]{};
    }
}
