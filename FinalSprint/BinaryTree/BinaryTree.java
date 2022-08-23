

public class BinaryTree {

    public Node root;

    public BinaryTree() {
        this.root = null;
    }
    
    protected static int compareFunction(Node node1, Node node2) {
        if (node1.data > node2.data) {
            return -1;
        } else if (node1.data < node2.data) {
            return 1;
        } else {
            return 0;
        }
    }

    public void insert(int data) {
       if (this.root == null) {
           this.root = new Node(data);
       } else {
           this.insertNode(this.root, data);
       }
    }

    private void insertNode(Node node, int data) {
        Node newNode = new Node(data);
        if (compareFunction(node, newNode) == -1) { // the error with traversal was here, this.root instead of node in this comparison operator
            if (node.left == null) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, data);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                this.insertNode(node.right, data);
            }
        }
    }

    public Node search(int data) {
        return this.searchNode(this.root, data);
    }

    private Node searchNode(Node node, int data) {
        if (node == null) {
            return null;
        } else if (node.data == data) {
            return node;
        } else if (compareFunction(node, new Node(data)) == -1) {
            return this.searchNode(node.left, data);
        } else {
            return this.searchNode(node.right, data);
        }
    }

    // not printing in the correct order...
    // fixed, incorrect comparison operator on line 31
    public String toString() {
        return this.toStringNode(this.root);
    }

    private String toStringNode(Node node) {
        if (node == null) {
            return "";
        } else {
            return this.toStringNode(node.left) + node.data + " " + this.toStringNode(node.right);
        }
    }

    public Node min() {
        return this.minNode(this.root);
    }

    private Node minNode(Node node) {
        if (node.left == null) {
            return node;
        } else {
            return this.minNode(node.left);
        }
    }

    public Node max() {
        return this.maxNode(this.root);
    }

    private Node maxNode(Node node) {
        if (node.right == null) {
            return node;
        } else {
            return this.maxNode(node.right);
        }
    }

    public void remove(int data) {
        this.removeNode(this.root, data);
    }

    private Node removeNode(Node node, int data) {
        if (node == null) {
            return null;
        } else if (compareFunction(node, new Node(data)) == -1) {
            node.left = this.removeNode(node.left, data);
            return node;
        } else if (compareFunction(node, new Node(data)) == 1) {
            node.right = this.removeNode(node.right, data);
            return node;
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node temp = this.minNode(node.right);
                node.data = temp.data;
                node.right = this.removeNode(node.right, temp.data);
                return node;
            }
        }
    }





}