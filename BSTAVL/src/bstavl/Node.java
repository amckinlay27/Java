package bstavl;

/**This class will create an instance of a node and store the nodes 
 * information.
 *
 * @author Adam McKinlay
 * @version 1.0 06 Nov 2017
 * 
 *                                                                */
public class Node {
    Node left;
    String storage;
    int count;
    Node right;
    int height;

    /**This constructor will create the instance of the node and initialize 
     * all of its vales.
     * 
     * @param l the left pointer.
     * @param s the element being stored.
     * @param r the right pointer.
     * 
     *                                                                   */
    public Node(Node l, String s, Node r) {
        left = l;
        storage = s;
        count = 1;
        right = r;
        height = 0;
    }//constructor
}//Node
