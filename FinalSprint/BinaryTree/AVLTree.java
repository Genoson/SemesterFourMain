public class AVLTree extends BinaryTree {

    public AVLTree() {
        super();
    }

    private int getNodeHeight(Node node) {
        if (node == null) {
            return -1;
        } else {
            return (Math.max(this.getNodeHeight(node.left), this.getNodeHeight(node.right)) + 1);
        }
    }

    private int getBalanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        int heightDifference = this.getNodeHeight(node.left) - this.getNodeHeight(node.right);
        return heightDifference;
    }

    private Node rotateLL(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;
        return temp;
    }

    private Node rotateRR(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;
        return temp;
    }

    private Node rotateLR(Node node) {
        node.left = rotateRR(node.left);
        return rotateLL(node);
    }

    private Node rotateRL(Node node) {
        node.right = rotateLL(node.right);
        return rotateRR(node);
    }

    @Override
    public void insert(int data) {
        this.root = this.insertNode(this.root, data);
    }

    private Node insertNode(Node node, int data) {
        Node newNode = new Node(data);
        if(node == null) {
            node = newNode;
        } else if (compareFunction(node, newNode) == -1) {
            node.left = this.insertNode(node.left, data);
        } else if (compareFunction(node, newNode) == 1) {
            node.right = this.insertNode(node.right, data);
        } else {
            return node;
        }

        int balanceFactor = this.getBalanceFactor(node);
        if(balanceFactor == 2) {
            if(compareFunction(node, node.left) == -1) {
                return rotateLL(node);
            } else {
                return rotateLR(node);
            }
        }
        if(balanceFactor == -2) {
            if(compareFunction(node, node.right) == 1) {
                return rotateRR(node);
            } else {
                return rotateRL(node);
            }
        }
        return node;
    }

    // other methods to follow depending on the requirements of the sprint

}
