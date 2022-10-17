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


    /**
     * enqueue test
     * */

    @Test
    void enqueue() {
        queueOfInts.enqueue(74);
        assertEquals(queueOfInts.peek(),74);
        queueOfInts.enqueue(45);
        assertEquals(queueOfInts.peek(),74);
        queueOfInts.enqueue(66);
        System.out.println(queueOfInts);
        assertEquals(queueOfInts.peek(),74); // check if the peek value is 74
        DLinkList<Integer> s = queueOfInts.getElems();
        System.out.println(s); // to be sure that it's a stack composed like : 74 -> 45 -> 66
        assertEquals(queueOfInts.numOfElems(),3);

    }

    /**
     * dequeue test
     * */
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


        assertEquals(queueOfInts.dequeue(),74);  // check if we remove the first node
        assertEquals(queueOfInts.dequeue(),45);
        boolean i = queueOfInts.isEmpty();
        assertFalse(i); // there is still one node
        assertEquals(queueOfInts.dequeue(),66);
        i  = queueOfInts.isEmpty(); // no node
        assertTrue(i);


    }

    /**
     * numOfElems test
     * */
    @Test
    void numOfElems() {

        queueOfInts.enqueue(5);
        assertEquals(queueOfInts.numOfElems(),1); // one node
        assertEquals(queueOfInts.dequeue(),5);
        assertEquals(queueOfInts.numOfElems(),0); // no node


    }

    /**
     * peek test
     * */

    @Test
    void peek() {
        queueOfInts.enqueue(5);
        assertEquals(queueOfInts.peek(),5);
        queueOfInts.dequeue();
        //assertNull(queueOfInts.peek());
        // if you delete the "//" you can see that we can't reach the peek because there is no node; (null)
    }

    /**
     * test ToString
     * */

    @Test
    void testToString() {
        queueOfInts.enqueue(74);
        queueOfInts.enqueue(45);
        System.out.println(queueOfInts);
        queueOfInts.dequeue();
        System.out.println(queueOfInts);
        queueOfInts.dequeue();
        System.out.println(queueOfInts);  // error because there is node

    }
}