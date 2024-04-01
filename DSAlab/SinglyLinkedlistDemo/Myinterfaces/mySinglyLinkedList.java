package DSAlab.SinglyLinkedlistDemo.Myinterfaces;

public interface mySinglyLinkedList {
    //insert At beginning
    //Insert at Head
    void addFirst(int element);

    //insert at End
    //insert at tail
    void addLast(int element);

    boolean isEmpty(); //will give true if linked list is empty

    int size(); //will give total number of elements in linked list

    void addAfterGivenNode(int givenElemnet, int element);

    void addBeforeGivenNode(int givenElement, int element);
    //remove element at last and first
    int removeFirst();
    int removeLast();

    int removeGivenNode(int givenElement);

    boolean search(int element);

    int first();
    int last();
}