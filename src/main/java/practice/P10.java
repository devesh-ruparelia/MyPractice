package practice;

import java.util.Stack;

public class P10 {


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.makeTrees());
    }

}

       class TreeNode {
          int val;
         TreeNode left;
          TreeNode right;
         TreeNode(int x) { val = x; }
      }
    class Solution {

        public boolean makeTrees(){
            TreeNode t1 = new TreeNode(10);
            TreeNode t2 = new TreeNode(3);
            TreeNode t1L=new TreeNode(23);
            TreeNode t2L=new TreeNode(13);
            TreeNode t1R=new TreeNode(13);
            TreeNode t2R=new TreeNode(23);
            TreeNode t2RC1R=new TreeNode(43);
            t2R.right = t2RC1R;

            t1.left=t1L;
            t1.right=t1R;
            t2.left=t2L;
            t2.right=t2R;
            return leafSimilar(t1,t2);

        }
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            Stack<Integer> seqStack = new Stack<>();
            buildStack(root1,seqStack);
            //seqStack.stream().forEach(e->System.out.println(e));
            return emptyStack(root2,seqStack);
        }
        public void buildStack(TreeNode root1,Stack<Integer> seqStack){
            if(root1!=null){
                if(root1.left==null && root1.right==null){
                    seqStack.push(root1.val);
                }
                else{
                    buildStack(root1.left,seqStack);
                    buildStack(root1.right,seqStack);
                }
            }
            return;
        }
        public boolean emptyStack(TreeNode root1,Stack<Integer> seqStack){
            boolean flag=true;
            if(root1!=null){
                if(root1.left==null && root1.right==null){
                    if(seqStack.empty() || seqStack.pop()!=root1.val)
                        return flag && false;
                }
                else{
                    flag= flag && emptyStack(root1.right,seqStack);
                    flag= flag && emptyStack(root1.left,seqStack);
                }
            }return flag;
        }

    }
