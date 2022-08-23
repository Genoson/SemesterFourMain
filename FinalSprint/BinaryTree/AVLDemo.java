public class AVLDemo {

    public static void main(String[] args) {

        AVLTree avlTree = new AVLTree();
        avlTree.insert(10);
        avlTree.insert(9);
        avlTree.insert(8);
        avlTree.insert(7);
        avlTree.insert(6);
        avlTree.insert(5);
        avlTree.insert(4);
        avlTree.insert(3);

        System.out.println(avlTree.toString());
        System.out.println((avlTree.root.data));
    }
    
}
