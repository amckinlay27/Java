package bstavl;
import java.io.*;
import java.util.*;

/**This program will create a BST using designated input, then it will create
 * a BST that is AVL compliant using balancing and rotation methods, then 
 * it will output the BST's contents, after it will delete all nodes d-n and 
 * again will print the tree using SOT.
 *
 * @author Adam McKinlay
 * @version 1.0 06 Nov 2017
 * @see bstavl.Node
 * @see bstavl.avl
 *                                                                         */
public class BSTAVL {
    public static Node tree, tree2;

    /**This construct will read the data in via a scanner and then call on the
     * appropriate methods to execute the intended use for the program. 
     * 
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     * @see java.io.File
     * @see java.io.FileReader
     * @see java.util.Scanner
     * @see #insert(bstavl.Node, java.lang.String) 
     * @see #filter(java.lang.String) 
     * @see #delete(bstavl.Node, java.lang.String) 
     * @see #toDelete(java.lang.String) 
     * @see #inOrder(bstavl.Node) 
     * 
     *                                                                      */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String input;
        File fi = new File("input.txt");
        FileReader fr = new FileReader(fi);

        Scanner in = new Scanner(fr);

        //Inserting
        System.out.println("Creating Tree...");
        while ((in.hasNext())) {
            try {
                input = in.next();
                input = filter(input);
                tree = insert(tree, input);
            } catch (NoSuchElementException e) {

            }
        }
        in.close();
        fr.close();
        
        //prePrint(tree);
        System.out.println("SOT...");
        inOrder(tree);
        System.out.println("The tree is AVL complaint:  " + avl.isAVL(tree));

        tree2 = tree;

        //Deleting
        File fi2 = new File("input.txt");
        FileReader fr2 = new FileReader(fi2);

        Scanner in2 = new Scanner(fr2);
        System.out.println("\nDeleting From Tree...");

        input = in2.next();

        while ((in2.hasNext())) {
            try {
                input = filter(input);
                if (toDelete(input) == true) {
                    //System.out.println("Delete: " + input);
                    tree2 = delete(tree2, input);
                }
                input = in2.next();
            } catch (NoSuchElementException e) {

            }
        }
        
        fr2.close();
        in2.close();

        System.out.println("SOT...");
        inOrder(tree2);
        System.out.println("The tree is AVL complaint:  " + avl.isAVL(tree2));
    }//constructor

    /**Will determine if the input needs to be deleted or not via boolean.
     * 
     * @param tbf   The input to determine if it need to be deleted.
     * @return      Returns decision to terminate or not.
     *                                                                  */
    public static boolean toDelete(String tbf) {
        if (tbf.startsWith("d") || tbf.startsWith("D")) {
            return true;
        } else if (tbf.startsWith("e") || tbf.startsWith("E")) {
            return true;
        } else if (tbf.startsWith("f") || tbf.startsWith("F")) {
            return true;
        } else if (tbf.startsWith("g") || tbf.startsWith("G")) {
            return true;
        } else if (tbf.startsWith("h") || tbf.startsWith("H")) {
            return true;
        } else if (tbf.startsWith("i") || tbf.startsWith("I")) {
            return true;
        } else if (tbf.startsWith("j") || tbf.startsWith("J")) {
            return true;
        } else if (tbf.startsWith("k") || tbf.startsWith("K")) {
            return true;
        } else if (tbf.startsWith("l") || tbf.startsWith("L")) {
            return true;
        } else if (tbf.startsWith("m") || tbf.startsWith("M")) {
            return true;
        } else if (tbf.startsWith("n") || tbf.startsWith("N")) {
            return true;
        } else {
            return false;
        }
    }//toDelete

    /**Removes unwanted characters from the string.
     * 
     * @param tbf   The string being filtered.
     * @return      The filtered string.
     *                                           */
    public static String filter(String tbf) {
        String out = tbf;
        if (tbf.contains(",")) {
            out = tbf.substring(0, tbf.indexOf(","));
            out = filter(out);
        }
        if (tbf.contains("(")) {
            out = tbf.substring(0, tbf.indexOf("("));
            out = filter(out);
        }
        if (tbf.contains(")")) {
            out = tbf.substring(0, tbf.indexOf(")"));
            out = filter(out);
        }
        if (tbf.contains(".")) {
            out = tbf.substring(0, tbf.indexOf("."));
            out = filter(out);
        }
        if (tbf.contains("-")) {
            out = tbf.substring(0, tbf.indexOf("-"));
            out = filter(out);
        }
        if (tbf.contains(";")) {
            out = tbf.substring(0, tbf.indexOf(";"));
            out = filter(out);
        }
        return out;
    }//filter

    /** Removes a node from the tree and maintains AVL compliance.
     * 
     * @param root  The tree to delete from.
     * @param info  The key to find within the tree.
     * @return      The tree with the removed element that is AVL balanced.
     * @see bstavl.avl#balance(bstavl.Node) 
     * @see #successor(bstavl.Node) 
     * 
     *                                                                   */
    public static Node delete(Node root, String info) {
        if (root == null) {
            //System.out.println("Not Found: " + info);
            return root;
        }

        if (root.storage.compareTo(info) < 0) {
            root.left = delete(root.left, info);
        } else if (root.storage.compareTo(info) > 0) {
            root.right = delete(root.right, info);
        } else if (root.left != null && root.right != null) {
            root.storage = successor(root.right).storage;
            root.count = successor(root.right).count;
            root.right = delete(root.right, root.storage);
        } else {
            if (root.left != null) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return avl.balance(root);
    }//delete

    /**Finds the node that is to be replace a node that is deleted.
     * 
     * @param tree  The tree to search from.
     * @return      The successor of the node to be deleted.
     * 
     *                                                           */
    public static Node successor(Node tree) {
        if (tree.left == null) {
            return tree;
        } else {
            successor(tree.left);
        }
        return tree;
    }//successor
    
    /**Adding an String element to the tree.
     * 
     * @param root  The tree to insert into.
     * @param tbi   The element to be inserted.
     * @return      The tree with the insertion and AVL compliance.
     * @see bstavl.avl#balance(bstavl.Node) 
     * 
     *                                                           */
    public static Node insert(Node root, String tbi) {
        Node newNode;

        if (root == null) {
            return newNode = new Node(null, tbi, null);

        }
        if (root.storage.compareTo(tbi) < 0) {
            root.left = insert(root.left, tbi);
        } else if (root.storage.compareTo(tbi) > 0) {
            root.right = insert(root.right, tbi);
        } else if (root.storage.equals(tbi)) {
            root.count += 1;
        }
        return avl.balance(root);
    }//insert

    /**A traversal method where elements are displayed.
     * 
     * @param tree  The tree to traverse.
     * 
     *                                               */
    public static void inOrder(Node tree) {
        //left
        if (tree.left != null) {
            inOrder(tree.left);
        }
        //vist
        System.out.println(tree.storage + " " + tree.count);
        //right
        if (tree.right != null) {
            inOrder(tree.right);
        }
    }//inOrder

   /**A traversal method where elements are displayed, this method is used 
     * used for testing purposes to determine if the trees initial build is 
     * correct.
     * 
     * @param tree  The tree to traverse.
     * 
     *                                                                   */
    public static void prePrint(Node tree) {
        //vist
        System.out.println(tree.storage + " " + tree.count);
        //left
        if (tree.left != null) {
            prePrint(tree.left);
        }
        //right
        if (tree.right != null) {
            prePrint(tree.right);
        }
    }//prePrint
}//BSTAVL
