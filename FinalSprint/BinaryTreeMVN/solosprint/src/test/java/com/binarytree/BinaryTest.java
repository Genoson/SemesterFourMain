package com.binarytree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTest {

    @Test
    public void testConstructor() {
        BinaryTree binaryTree = new BinaryTree();
        assertEquals(null, binaryTree.root);
    }

    @Test
    public void testInsert() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(11);
        binaryTree.insert(12);
        binaryTree.insert(13);
        assertEquals(10, binaryTree.root.data);
        assertEquals(null, binaryTree.root.left);
        assertEquals(11, binaryTree.root.right.data);
        assertEquals(12, binaryTree.root.right.right.data);
        assertEquals(13, binaryTree.root.right.right.right.data);
    }

    @Test
    public void testSearch() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(11);
        binaryTree.insert(12);
        binaryTree.insert(13);
        assertEquals(11, binaryTree.search(11).data);
        assertNull(binaryTree.search(14));
    }

    @Test
    public void testRemove(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(11);
        binaryTree.insert(12);
        binaryTree.insert(13);
        binaryTree.remove(11);
        assertNull(binaryTree.search(11));
    }

    @Test
    public void testMin(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(11);
        binaryTree.insert(12);
        binaryTree.insert(13);
        assertEquals(10, binaryTree.min().data);
    }

    @Test
    public void testMax(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(11);
        binaryTree.insert(12);
        binaryTree.insert(13);
        assertEquals(13, binaryTree.max().data);
    }

}
