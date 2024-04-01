package DSAlab.DemoTree.Main;

import DSAlab.DemoTree.Implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        bst.insert(3);
        bst.insert(5);
        bst.inOrder(bst.getRoot());
    }
}
