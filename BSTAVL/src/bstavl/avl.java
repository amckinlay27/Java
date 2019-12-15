package bstavl;

/**This file contains all methods pertinent to AVL balancing and its rotations.
 *
 * @author Adam McKinlay
 * @version 1.0 06 Nov 2017
 * @see bstavl.Node
 * 
 *                                                                           */
public class avl {
    private static final int ALLOWED_IMBALANCE = 1;

    /**Will determine if a given tree needs re-balancing in order to ensure
     * the tree is AVl compliant.
     * 
     * @param t The tree to evaluate.
     * @return  The tree that is re-balanced.
     * @see #rotateWithLeftChild(bstavl.Node) 
     * @see #rotateWithRightChild(bstavl.Node) 
     * @see #doubleWithLeftChild(bstavl.Node) 
     * @see #doubleWithRightChild(bstavl.Node) 
     * @see #height(bstavl.Node) 
     *                                                                   */
    public static Node balance(Node t) {
        if (t == null) {
            return t;
        }

        if (height(t.left) - height(t.right) > ALLOWED_IMBALANCE) {
            if (height(t.left.left) >= height(t.left.right)) {
                t = rotateWithLeftChild(t);
            } else {
                t = doubleWithLeftChild(t);
            }
        } else if (height(t.right) - height(t.left) > ALLOWED_IMBALANCE) {
            if (height(t.right.right) >= height(t.right.left)) {
                t = rotateWithRightChild(t);
            } else {
                t = doubleWithRightChild(t);
            }
        }
        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }//balance

    /**Rotating by going right and then left with the k3 element.
     * 
     * @param k3    The node being rotated.
     * @return      The tree (subtree) that has been rotated.
     * @see #rotateWithRightChild(bstavl.Node) 
     * @see #rotateWithLeftChild(bstavl.Node) 
     * 
     *                                                         */
    public static Node doubleWithLeftChild(Node k3) {
        k3.left = rotateWithRightChild(k3.left);
        k3 = rotateWithLeftChild(k3);
        return k3;
    }//doubleWithLeftChild

    /**Rotating by going left and then right with the k1 element.
     * 
     * @param k1    The node being rotated.
     * @return      The tree (subtree) that has been rotated.
     * @see #rotateWithLeftChild(bstavl.Node)
     * @see #rotateWithRightChild(bstavl.Node) 
     * 
     *                                                         */
    public static Node doubleWithRightChild(Node k1) {
        k1.right = rotateWithLeftChild(k1.right);
        k1 = rotateWithRightChild(k1);
        return k1;
    }//doubleWithRightChild

    /**A single rotation with the k2 element in the left direction (ie. k1).
     * 
     * @param k2    The node being rotated.
     * @return      The tree (subtree) that has been rotated.
     * @see #height(bstavl.Node) 
     * 
     *                                                                    */
    public static Node rotateWithLeftChild(Node k2) {
        Node k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;

        k2.height = (Math.max(height(k2.left), height(k2.right))) + 1;
        k1.height = (Math.max(height(k1.left), k2.height)) + 1;
        k2 = k1;
        return k1;
    }//rotateWithLeftChild

    /**A single rotation with the k1 element in the right direction (ie. k2).
     * 
     * @param k1    The node being rotated.
     * @return      The tree (subtree) that has been rotated.
     * @see #height(bstavl.Node) 
     * 
     *                                                                    */
    public static Node rotateWithRightChild(Node k1) {
        Node k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;

        k1.height = (Math.max(height(k1.right), height(k1.left))) + 1;
        k2.height = (Math.max(height(k2.right), k1.height)) + 1;
        k1 = k2;
        return k2;
    }//rotateWithRightChild

    /**Determines the height of any given node (integer).
     * 
     * @param root  The node whose height is to be determined.
     * @return      The height of the node (integer).
     * 
     *                                                      */
    public static int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            return root.height;
        }
    }//height

    /**Determines if an entire tree is AVL compliant.
     * 
     * @param root  The tree to determine if its compliant.
     * @return      The boolean value of the result.
     * @see #height(bstavl.Node) 
     * 
     *                                                   */
    public static boolean isAVL(Node root) {
        int ls, rs;

        if (root == null) {
            return true;
        }

        ls = height(root.left);
        rs = height(root.right);

        //chekcing heights
        if ((ls - rs) <= ALLOWED_IMBALANCE) {
            //checking for all of tree
            if(isAVL(root.right) && isAVL(root.left)){
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
    }//isAVL
}//avl
