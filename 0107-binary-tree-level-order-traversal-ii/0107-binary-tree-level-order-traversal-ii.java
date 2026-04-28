class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        fun(root, 0, ans);
        Collections.reverse(ans);
        return ans; 
    }

    void fun(TreeNode root, int lvl, List<List<Integer>> ans) {
        if(root == null) return;

        // If we are visiting this level for the first time, create a new list for it
        if(lvl == ans.size()) {
            ans.add(new ArrayList<>());
        }
        
        // Add the current node's value to its corresponding levels list
        ans.get(lvl).add(root.val);

        // Traverse left and right, increasing the level by 1
        fun(root.left, lvl + 1, ans);
        fun(root.right, lvl + 1, ans);
    }
}