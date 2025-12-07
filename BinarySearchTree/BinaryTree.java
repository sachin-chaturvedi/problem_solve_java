public class BinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode (int val){
            this.val = val;
        }
    }

    public static int searchTreeTarget(TreeNode root, int target){
        if(root == null) return 0;
        if(root.val == target) return root.val;
        else if(root.val<target) return searchTreeTarget(root.right, target);
        else return searchTreeTarget(root.left, target);
    }
    public static TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        if(root.val > val){
            if(root.left == null) root.left = new TreeNode(val);
            else insertIntoBST(root.left ,val);
        }else{
            if(root.right==null) root.right = new TreeNode(val);
            else insertIntoBST(root.right, val);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        TreeNode a = new TreeNode(6);
        root.left = a;
        TreeNode b = new TreeNode(4);
        a.left = b;
        TreeNode c = new TreeNode(7);
        a.right = c;
        TreeNode d = new TreeNode(12);
        root.right = d;
        TreeNode e = new TreeNode(11);
        d.left = e;
        TreeNode f = new TreeNode(13);
        d.right = f;
        System.out.println(searchTreeTarget(root, 4));



        
    }
    
}
