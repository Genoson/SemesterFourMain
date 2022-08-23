public class BinaryDemo {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(5);
        binaryTree.insert(15);
        binaryTree.insert(7);
        binaryTree.insert(3);
        binaryTree.insert(14);
        binaryTree.insert(13);
        binaryTree.insert(17);

        System.out.println(binaryTree.root.data);

        // System.out.println(binaryTree.search(5).data);

        // System.out.println(binaryTree.toString());
        // binaryTree.remove(5);
        System.out.println(binaryTree.toString());
    }
    
}
