package src.DSAlab.SinglyLinkedlistDemo.Polynomial;

public class PolyomialAddMain {
    public static void main(String[] args) {
        PolynomialEvaluate list1 = new PolynomialEvaluate();
        PolynomialEvaluate list2 = new PolynomialEvaluate();
        list2.addNodeFirst(2, 3);
        list2.addNodeLast(2, 2);
        list1.addNodeFirst(2, 3);
        PolynomialEvaluate obj = new PolynomialEvaluate();
        obj.polyAdd(list1, list2);

    }
}
