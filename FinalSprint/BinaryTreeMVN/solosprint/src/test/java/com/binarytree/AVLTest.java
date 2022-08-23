package com.binarytree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AVLTest {
    
    @Test
    public void testConstructor() {
        AVLTree avl = new AVLTree();
        assertEquals(null, avl.root);
    }

    @Test
    public void testInsert() {
        AVLTree avl = new AVLTree();
        avl.insert(10);
        avl.insert(11);
        avl.insert(9);
        assertEquals(10, avl.root.data);
        assertEquals(9, avl.root.left.data);
        assertEquals(11, avl.root.right.data);
    }

    @Test
    public void testSearch() {
        AVLTree avl = new AVLTree();
        avl.insert(10);
        avl.insert(11);
        avl.insert(12);
        avl.insert(13);
        assertEquals(11, avl.search(11).data);
        assertNull(avl.search(14));
    }

    @Test
    public void testRemove(){
        AVLTree avl = new AVLTree();
        avl.insert(10);
        avl.insert(11);
        avl.insert(12);
        avl.insert(13);
        avl.remove(11);
        assertNull(avl.search(11));
    }

    @Test
    public void testMin(){
        AVLTree avl = new AVLTree();
        avl.insert(10);
        avl.insert(11);
        avl.insert(12);
        avl.insert(13);
        assertEquals(10, avl.min().data);
    }

    @Test
    public void testMax(){
        AVLTree avl = new AVLTree();
        avl.insert(10);
        avl.insert(11);
        avl.insert(12);
        avl.insert(13);
        assertEquals(13, avl.max().data);
    }

    @Test
    public void testBalance(){
        AVLTree avl = new AVLTree();
        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        avl.insert(4);
        avl.insert(5);
        avl.insert(6);
        avl.insert(7);
        avl.insert(8);
        avl.insert(9);
        avl.insert(10);
        assertEquals(4, avl.root.data);
        assertEquals(2, avl.root.left.data);
        assertEquals(1, avl.root.left.left.data);
        assertEquals(3, avl.root.left.right.data);
        assertEquals(8, avl.root.right.data);
        assertEquals(6, avl.root.right.left.data);
        assertEquals(7, avl.root.right.left.right.data);
        assertEquals(5, avl.root.right.left.left.data);
        assertEquals(9, avl.root.right.right.data);
        assertEquals(10, avl.root.right.right.right.data);
        
    }

}
