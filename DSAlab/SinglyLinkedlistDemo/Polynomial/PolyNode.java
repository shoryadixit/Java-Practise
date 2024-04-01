package src.DSAlab.SinglyLinkedlistDemo.Polynomial;

public class PolyNode {

    int coef;
    int pow;
    PolyNode next;

    public PolyNode(int coef, int pow) {
        this.coef = coef;
        this.pow = pow;
    }

    public PolyNode(int coef, int pow, PolyNode next) {
        this.coef = coef;
        this.pow = pow;
        this.next = next;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public PolyNode getNext() {
        return next;
    }

    public void setNext(PolyNode next) {
        this.next = next;
    }
}
