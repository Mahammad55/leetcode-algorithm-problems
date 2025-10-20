package collection.medium;

// 701
public class InsertBinarySearchTree {
    public static void main(String[] args) {

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null || root.val == val) return new TreeNode(val);
        else {
            if (root.val > val) {
                root.left = insertIntoBST(root.left, val);
            } else if (root.val < val) {
                root.right = insertIntoBST(root.right, val);
            }
            return root;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
