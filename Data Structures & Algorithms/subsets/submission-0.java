class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        // final answer store karne ke liye
        List<List<Integer>> ans = new ArrayList<>();

        // current subset store karne ke liye
        List<Integer> current = new ArrayList<>();

        // recursion start karenge
        solve(0, nums, current, ans);

        return ans;
    }

    public void solve(int index, int[] nums,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        // agar saare elements process ho gaye
        if (index == nums.length) {

            // current subset ki copy answer me add karenge
            ans.add(new ArrayList<>(current));
            return;
        }

        // -----------------------------
        // Choice 1 : Current element ko lena
        // -----------------------------

        current.add(nums[index]);

        solve(index + 1, nums, current, ans);

        // backtracking
        // jo element abhi add kiya tha usse hata denge
        current.remove(current.size() - 1);

        // -----------------------------
        // Choice 2 : Current element ko nahi lena
        // -----------------------------

        solve(index + 1, nums, current, ans);
    }
}