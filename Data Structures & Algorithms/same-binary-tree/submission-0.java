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

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;

        }

        if(p == null || q == null || p.val != q.val){
            return false;
        }


        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}

/*
DFS,
Base Case: if qroot == null && proot == null
                return true
Catch for diiference if qRoot.val != pRoot.val || qRoot == null || qRoot == null
                            return false;

no need for second method this has what i need

            1           1
          2   3       3   2

    1 = 1 keep going right
    2 != 3 return false 
    back to 1 go left 
    2 != 3 return false
    back to 1 =1
    now we have both the left sub tree and right are false
    return false


    if the dfs can go through the entire tree without returning false then we know its true
    return sametree(right) && sametree(left)
    this will either return true or false up the stack.


    PSEUDO
    SameTree(TreeNode p, TreeNode q)
        if(p != q || !(p == null && q == null))
            return false
        
        if(p == null && q == null)
            return true
        
        return Sametree(p.right, q.right) && Sametree(p.left, q.left)


WALKTHOUGH p = [1,2,3], q = [1,2,3]
1, 1
neither null, or different, but equal
check right again
2, 2
neither null, or different, but equal
check right
null, null
but null, return true
back up the stack
from 2,2 check left null, null return true for that side
go up stack 1,1 check left now
3,3 go right
null, null retrun true
check left from 3,3
null, null return true
both subtrees are true at 2,2 and 3,3
back to 1,1 both left and right side of three returned true end recursion
answer is true

p = [4,7], q = [4,null,7]
4,4 keep going right
7,null condition !(p == null && q == null) is true so, returns false
go left null,7 return false aswell

now right == false && left == false im not asking if theyre the same im asking if both are true




*/
