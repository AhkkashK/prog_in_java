package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test of the pop method used to pop a node from the Stack
     */

    @Test
    void pop() {
        stackOfInts.push(74);
        assertEquals(stackOfInts.peek(),74);
        stackOfInts.push(45);
        assertEquals(stackOfInts.peek(),45);
        stackOfInts.push(66);
        assertEquals(stackOfInts.peek(),66);
        DLinkList<Integer> s = stackOfInts.getElems();
        System.out.println(s);
        assertEquals(stackOfInts.numOfElems(),3);



        assertEquals(stackOfInts.pop(),66);
        assertEquals(stackOfInts.pop(),45);
        boolean i = stackOfInts.isEmpty();
        assertFalse(i);
        assertEquals(stackOfInts.pop(),74);
        i  = stackOfInts.isEmpty();
        assertTrue(i);

    }

    /**
     * Test of the push method used to push a node into the Stack
     */

    @Test
    void push() {
        stackOfInts.push(74);
        assertEquals(stackOfInts.peek(),74);
        stackOfInts.push(45);
        assertEquals(stackOfInts.peek(),45);
        stackOfInts.push(66);
        assertEquals(stackOfInts.peek(),66);
        DLinkList<Integer> s = stackOfInts.getElems();
        System.out.println(s);
        assertEquals(stackOfInts.numOfElems(),3);
    }

    /**
     * This test show us that the numOfElems method works pretty well.
     * Indeed, we push one node so there is one element in the Stack.
     * Then, we pop this node. It makes the Stack empty, with 0 node.
     */
    @Test
    void numOfElems() {
        stackOfInts.push(5);
        assertEquals(stackOfInts.numOfElems(),1);
        assertEquals(stackOfInts.pop(),5);
        assertEquals(stackOfInts.numOfElems(),0);
    }

    /**
     * This test verify that the peek method works well.
     * We push one node, we make sure that the peeked node is the one we just pushed.
     */

    @Test
    void peek() {
        stackOfInts.push(5);
        assertEquals(stackOfInts.peek(),5);
        stackOfInts.pop();
        try{
            assertNull(stackOfInts.peek());
        }catch(Exception e){
            System.out.println("in catch,no node");
        }

    }

    @Test
    void testToString() {
        stackOfInts.push(5);
        stackOfInts.push(11);
        System.out.println(stackOfInts);
        stackOfInts.pop();
        System.out.println(stackOfInts);
        stackOfInts.pop();
        try{
            System.out.println(stackOfInts);
        }catch (Exception e){
            System.out.println(" in catch , no node");
        }

    }
}