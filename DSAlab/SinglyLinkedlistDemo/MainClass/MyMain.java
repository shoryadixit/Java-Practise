package DSAlab.SinglyLinkedlistDemo.MainClass;
import DSAlab.SinglyLinkedlistDemo.implementation.MyLinkedList;
public class MyMain {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addFirst(100);
        linkedList.addFirst(500);
        linkedList.addFirst(400);
        linkedList.addFirst(300);
        linkedList.addFirst(200);
        //linkedList.traverse();
       /* linkedList.addLast(200);
        linkedList.addLast(300);
        //linkedList.traverse();
        linkedList.addLast(400);
        linkedList.addLast(500);
*/
        linkedList.traverse();

        System.out.println();
        System.out.println("Size = " + linkedList.size());
        linkedList.removeGivenNode(100);
        linkedList.traverse();
        System.out.println();
        System.out.println("Size = " + linkedList.size());
        System.out.println(linkedList.search(200));
        linkedList.traverse();
        System.out.println();
        linkedList.reversedLinkedList(linkedList.getHead());
       /* linkedList.addAfterGivenNode(500, 600);

        linkedList.traverse();

        System.out.println();
        System.out.println("Size = " + linkedList.size());

        System.out.println(linkedList.first());
        System.out.println(linkedList.last());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.size());
        linkedList.traverse();
        System.out.println();
        System.out.println(linkedList.removeLast());
        linkedList.traverse();
        System.out.println();*/
    }
}
