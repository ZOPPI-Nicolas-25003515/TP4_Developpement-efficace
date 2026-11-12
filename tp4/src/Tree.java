public class Tree<T> {
    private Node<T> root;
    public Tree () {
        root = null;
    }
    public Tree (T data) {
        root = new Node<T>(data);
    }
    private static class Node<T> {
        T data;
        Node<T> ln,rn;

        public Node(T data) {
        }

        public T getData() {
            return data;
        }
        public void setData (T data) {
            this.data = data;
        }

        public Node<T> getLn() {
            return ln;
        }

        public Node<T> getRn() {
            return rn;
        }
        public void setLn (Node ln) {
            this.ln = ln;
        }

        public void setRn (Node rn) {
            this.rn = rn;
        }
    }
}


/*
import java.util.ArrayList;
import java.util.List;

public class NodeTree<T> {
    private T element;
   private NodeTree leftNode;
    private NodeTree rightNode;

    public NodeTree (NodeTree leftNode, NodeTree rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public NodeTree (NodeTree leftNode) {
        this.leftNode = leftNode;
    }

    public T getElement () {
        return element;
    }

    private T root() {
    }



    private class Node {
        private T element;
        private Node next;
        public Node(Tree element) {
            this.element = element;
        }

        public Node(Tree element, Node next) {
            this.element = element;
            this.next = next;
        }

        public String toString() {
            return element.toString();
        }

        public Tree getElement () {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setElement(Tree nextElement) {
            element = nextElement;
        }

        public void setNext (Node newNext) {
            next = newNext;
        }

    }

 */