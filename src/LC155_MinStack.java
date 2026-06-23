public class LC155_MinStack {
    private Node node;

    public LC155_MinStack() {

    }

    public void push(int value) {
        if (node == null) {
            node = new Node(value, value, null);

        } else {
            node = new Node(value, Math.min(value, node.min), node);
        }

    }

    public void pop() {
        node = node.next;

    }

    public int top() {
        return node.value;

    }

    public int getMin() {
        return node.min;

    }

    class Node {
        int value;
        int min;
        Node next;

        public Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }

    }
}
