package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addFirst() {
        dLinkList.addFirst(4);

        assertEquals(dLinkList.getFirst(),4);
        assertEquals(dLinkList.getN(),1);

        dLinkList.addFirst(6);

        assertEquals(dLinkList.getFirst(),6);
        assertEquals(dLinkList.getLast(),4);
        assertEquals(dLinkList.getN(),2);

        dLinkList.addFirst(11);

        assertEquals(dLinkList.getFirst(),11);
        assertEquals(dLinkList.getLast(),4);
        assertEquals(dLinkList.getN(),3);
    }

    @Test
    void addLast() {
        dLinkList.addLast(4);

        assertEquals(dLinkList.getLast(),4);
        assertEquals(dLinkList.getFirst(),4);
        assertEquals(dLinkList.getN(),1);

        dLinkList.addLast(7);

        assertEquals(dLinkList.getFirst(),4);
        assertEquals(dLinkList.getLast(),7);
        assertEquals(dLinkList.getN(),2);
    }

    @Test
    void removeFirst() {
        dLinkList.addFirst(4);

        assertEquals(dLinkList.getN(),1);

        dLinkList.addFirst(8);

        assertEquals(dLinkList.getN(),2);
        assertEquals(dLinkList.getFirst(),8);

         int r = dLinkList.removeFirst();

         assertEquals(r,8);
         assertEquals(dLinkList.getFirst(),4);
         assertEquals(dLinkList.getN(),1);

         r = dLinkList.removeFirst();

         System.out.println(r);
         assertNull(dLinkList.first);
         assertEquals(dLinkList.getN(),0);

         dLinkList.removeFirst();
         System.out.println(r);

         assertNull(dLinkList.first);
         assertNull(dLinkList.last);
         assertEquals(dLinkList.getN(),0);


    }

    @Test
    void removeLast() {
        dLinkList.addFirst(4);
        dLinkList.addFirst(8);
        dLinkList.addFirst(10);
        assertEquals(dLinkList.getFirst(),10);
        assertEquals(dLinkList.getLast(),4);
        assertEquals(dLinkList.getN(),3);

        assertEquals(dLinkList.removeLast(),4);
        assertEquals(dLinkList.getFirst(),10);
        assertEquals(dLinkList.getLast(),8);
        assertEquals(dLinkList.getN(),2);

        assertEquals(dLinkList.removeLast(),8);
        assertEquals(dLinkList.getFirst(),10);
        assertEquals(dLinkList.getLast(),10);
        assertEquals(dLinkList.getN(),1);

        assertEquals(dLinkList.removeLast(),10);
        assertNull(dLinkList.first);
        assertNull(dLinkList.last);
        assertEquals(dLinkList.getN(),0);
    }
}