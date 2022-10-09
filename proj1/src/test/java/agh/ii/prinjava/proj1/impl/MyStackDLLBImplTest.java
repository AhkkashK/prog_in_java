package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

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

    @Test
    void numOfElems() {
        stackOfInts.push(5);
        assertEquals(stackOfInts.numOfElems(),1);
        assertEquals(stackOfInts.pop(),5);
        assertEquals(stackOfInts.numOfElems(),0);
    }

    @Test
    void peek() {
        stackOfInts.push(5);
        assertEquals(stackOfInts.peek(),5);
        stackOfInts.pop();
        // assertNull(queueOfInts.peek());
    }
}