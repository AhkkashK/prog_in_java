package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueue() {
        queueOfInts.enqueue(74);
        assertEquals(queueOfInts.peek(),74);
        queueOfInts.enqueue(45);
        assertEquals(queueOfInts.peek(),74);
        queueOfInts.enqueue(66);
        assertEquals(queueOfInts.peek(),74);
        DLinkList<Integer> s = queueOfInts.getElems();
        System.out.println(s);
        assertEquals(queueOfInts.numOfElems(),3);

    }

    @Test
    void dequeue() {
        queueOfInts.enqueue(74);
        assertEquals(queueOfInts.peek(),74);
        queueOfInts.enqueue(45);
        assertEquals(queueOfInts.peek(),74);
        queueOfInts.enqueue(66);
        assertEquals(queueOfInts.peek(),74);
        DLinkList<Integer> s = queueOfInts.getElems();
        System.out.println(s);


        assertEquals(queueOfInts.dequeue(),74);
        assertEquals(queueOfInts.dequeue(),45);
        boolean i = queueOfInts.isEmpty();
        assertFalse(i);
        assertEquals(queueOfInts.dequeue(),66);
        i  = queueOfInts.isEmpty();
        assertTrue(i);


    }

    @Test
    void numOfElems() {

        queueOfInts.enqueue(5);
        assertEquals(queueOfInts.numOfElems(),1);
        assertEquals(queueOfInts.dequeue(),5);
        assertEquals(queueOfInts.numOfElems(),0);


    }

    @Test
    void peek() {
        queueOfInts.enqueue(5);
        assertEquals(queueOfInts.peek(),5);
        queueOfInts.dequeue();
       // assertNull(queueOfInts.peek());
    }
}