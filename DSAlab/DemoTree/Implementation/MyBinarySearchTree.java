package DSAlab.DemoTree.Implementation;

public class MyBinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            //compare and move to subtree (either left or right)
            Node temp = root;
            //keep a parent reference which is used for inserting new child node
            Node parent = null;
            while (temp != null) {
                parent = temp;
                //temp will be either left or right child of root or current temp
                //on the basis of comparison
                if (data <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (data <= parent.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    public void inOrder(Node node) {
        /*
            process the left sub tree
            process element
            process right subtree
        */
        if (node == null) {
            return;
        } else {
            inOrder(node.getLeft());
            System.out.print(node.getData() + ", ");
            inOrder(node.getRight());
        }
    }

    public boolean search(int element) {
        boolean response = false;
        Node temp = root;
        while (temp != null) {
            if (temp.getData() == element) {
                response = true;
                break;
            } else {
                if (element < temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return response;
    }

    public void delete(int element) {
        //case 1: deleting a leaf node
        Node temp = root;
        Node parent = null;
        while (temp != null && temp.getData() != element) {
            parent = temp;
            if (element < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        if (temp != null) {
            if (isLeaf(temp)) {
                if (element < parent.getData()) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            }
        } else {
            System.out.println("Element not Found");
        }
    }

    private boolean isLeaf(Node temp) {
        if (temp.getLeft() == null) {
            return temp.getRight() == null;
        }
        return false;
    }

    public boolean search(int[] arr, int searchElement) {
        boolean response = false;
        //traverse the arr using loop
        for (int i = 0; i < arr.length; i++) {
            //compare each element with searchElement
            if (arr[i] == (searchElement)) {
                //if found
                response = true;
                break;
            }
        }
        return response;
    }

    //find the index of searchElement in given arr, if not present return -1
    public int findIndex(int[] arr, int searchElement) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement){
                n = i;
            }
        }
        return n;
    }

    //find the index of nth occurrence of givenElement in the arr
    //if  givenElement didn't have n occurrence return -1,
    // if givenElement not present in arr return -1
    public int findNthIndex(int[] arr, int givenElement, int n) {
        return -1;
    }
}
