public class Node {

    private Integer element;
    private Node next;


    public Node(Integer element) {
        this.element = element;
    }

    public Node(Integer element, Node next) {
        this.element = element;
        this.next = next;
    }

    public String toString() {
        return element.toString();
    }

    public Integer getElement () {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setElement(Integer newElem) {
        element = newElem;
    }

    public void setNext (Node newNext) {
        next = newNext;
    }

}