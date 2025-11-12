import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class PathSum  {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return f(root,0,targetSum);
        
    }
    public boolean f(TreeNode node,int SumTillParent,int targetSum){
        if(node==null){
            return false;
        }
        else if(node.left==null && node.right==null){
            int currentSum=SumTillParent+node.val;
            if(currentSum==targetSum)return true;
            else return false;
        }
        else{
            int currentSum=SumTillParent+node.val;
            boolean result=false;
            if(node.left!=null){
                result=result||f(node.left,currentSum,targetSum);
            }
            if(node.right!=null){
                result=result||f(node.right,currentSum,targetSum);
            }
            return result;
        }
    }
}