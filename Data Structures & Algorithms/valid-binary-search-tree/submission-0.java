class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean check(TreeNode root, long min, long max) {

        // agar node nahi hai toh valid BST hai
        if(root == null){
            return true;
        }

        // current node allowed range ke andar hona chahiye
        if(root.val <= min || root.val >= max){
            return false;
        }

        // left subtree me values current node se choti honi chahiye
        boolean lh = check(root.left, min, root.val);

        // right subtree me values current node se badi honi chahiye
        boolean rh = check(root.right, root.val, max);

        // dono subtree valid honi chahiye
        return lh && rh;
    }
}