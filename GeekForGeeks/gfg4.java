package GeekForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class gfg4 {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String[] ip = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }

            i++;
            if (i >= ip.length)
                break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    static void printOrder(Node root) {
        if (root == null)
            return;
        printOrder(root.left);
        System.out.println(root.data + " ");
        printOrder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Check_for_BST g = new Check_for_BST();
            if (g.isBST(root))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    }
}

class Check_for_BST {
    /*boolean isBST(Node root) {
        boolean BST = false;
        int countleft = 0;
        int countright = 0;
        if (root.left.data < root.data) {
            Node temp = new Node(root.left.data);
            countleft += 1;
            isBST(temp.left);
        }
        if (root.right.data > root.data) {
            Node temp1 = new Node(root.right.data);
            countright += 1;
            isBST(temp1.right);
        }
        if (countleft == countright){
            BST = true;
        }
        return BST;
    }*/
    boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }
}