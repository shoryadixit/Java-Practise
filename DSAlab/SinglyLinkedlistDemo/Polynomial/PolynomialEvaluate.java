package src.DSAlab.SinglyLinkedlistDemo.Polynomial;

public class PolynomialEvaluate {
    private PolyNode head;
    private PolyNode tail;
    private int size;

    public PolynomialEvaluate() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addNodeLast(int coef, int pow) {
        PolyNode node = new PolyNode(coef, pow);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    public void addNodeFirst(int coef, int pow) {
        PolyNode node = new PolyNode(coef, pow);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
        }
    }

    public void polyAdd(PolynomialEvaluate l1, PolynomialEvaluate l2) {

        PolyNode temp1 = l1.head;
        PolyNode temp2 = l2.head;
        PolynomialEvaluate l3 = new PolynomialEvaluate();
        while (temp1 != null) {
            while (temp2 != null) {
                if (temp1.getPow() == temp2.getPow()) {
                    int addcoeff = (temp1.getCoef() + temp2.getCoef());
                    l3.addNodeLast((temp1.coef + temp2.coef), temp1.getPow());
                } else if (temp2.getPow() > temp1.getPow()) {
                    l3.addNodeFirst(temp1.getCoef(), temp1.getPow());
                } else if (temp2.getPow() < temp1.getPow()) {
                    l3.addNodeLast(temp2.coef, temp2.pow);
                }
                temp2 = temp2.getNext();
            }
            temp1 = temp1.getNext();
        }
        l3.traverse();
    }

    public void traverse() {
        if (!isEmpty()) {
            PolyNode temp = head;
            System.out.print("head");
            while (temp != null) {
                System.out.print("-->" + temp.getCoef() + ", " + temp.getPow());
                temp = temp.getNext();
            }
        }
    }
}
