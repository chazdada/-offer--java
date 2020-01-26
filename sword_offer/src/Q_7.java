
public class Q_7 {
    public TreeNode con_tree(int [] pre,int p_l,int p_r,int [] in,int i_l,int i_r){
        if (p_l > p_r || i_l > i_r){
            return null;
        }
        TreeNode root = new TreeNode(pre[p_l]);
        for (int i = i_l; i <= i_r;i++){
            if (pre[p_l] == in[i]){
                root.left = con_tree(pre,p_l+1,p_l+i-i_l,in,i_l,i-1);
                root.right = con_tree(pre,p_l+i-i_l+1,p_r,in,i+1,i_r);
            }
        }

        return root;
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0 ){
            return null;
        }

        TreeNode treeNode = con_tree(pre, 0, pre.length - 1, in, 0, in.length - 1);

        return treeNode;
    }
}
