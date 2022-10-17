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


    /**
     * addFirst check
     * */
    @Test
    void addFirst() {
        dLinkList.addFirst(4);

        assertEquals(dLinkList.getFirst(),4); // check if the first node value is 4
        assertEquals(dLinkList.n,1); // check number of node in the DLL

        dLinkList.addFirst(6);

        assertEquals(dLinkList.getFirst(),6); // check if 6 is add at the start of the DLL
        assertEquals(dLinkList.getLast(),4); //
        assertEquals(dLinkList.n,2);

        dLinkList.addFirst(11);

        assertEquals(dLinkList.getFirst(),11);
        assertEquals(dLinkList.getLast(),4);
        assertEquals(dLinkList.n,3);
    }
    /**
     * addLast test
     * */

    @Test
    void addLast() {
        dLinkList.addLast(4);

        assertEquals(dLinkList.getLast(),4);
        assertEquals(dLinkList.getFirst(),4);  // check if 4 is last node and first node value
        assertEquals(dLinkList.n,1);

        dLinkList.addLast(7);

        assertEquals(dLinkList.getFirst(),4);
        assertEquals(dLinkList.getLast(),7); // check if 7 is add at the end of DLL
        assertEquals(dLinkList.n,2);
    }

    /**
     *removeFirst test
     * */

    @Test
    void removeFirst() {
        dLinkList.addFirst(4);

        assertEquals(dLinkList.n,1);

        dLinkList.addFirst(8);

        assertEquals(dLinkList.n,2);
        assertEquals(dLinkList.getFirst(),8);

         int r = dLinkList.removeFirst();

         assertEquals(r,8); // check if the remove node value is 8
         assertEquals(dLinkList.getFirst(),4); // check if the new first node value  is 4
         assertEquals(dLinkList.n,1);

         r = dLinkList.removeFirst();

         assertEquals(r,4);
         assertNull(dLinkList.first); // there is no node, check if first null
         assertEquals(dLinkList.n,0);
         assertNull(dLinkList.last);



    }

    /**
     * removeLast test
     * */

    @Test
    void removeLast() {
        dLinkList.addFirst(4);
        dLinkList.addFirst(8);
        dLinkList.addFirst(10);
        assertEquals(dLinkList.getFirst(),10);
        assertEquals(dLinkList.getLast(),4);
        assertEquals(dLinkList.n,3);

        assertEquals(dLinkList.removeLast(),4); // check if the value of the node removed is 4
        assertEquals(dLinkList.getFirst(),10);
        assertEquals(dLinkList.getLast(),8);
        assertEquals(dLinkList.n,2);

        assertEquals(dLinkList.removeLast(),8);
        assertEquals(dLinkList.getFirst(),10);
        assertEquals(dLinkList.getLast(),10);
        assertEquals(dLinkList.n,1);

        assertEquals(dLinkList.removeLast(),10); // check if the value of the node removed is 10
        assertNull(dLinkList.first); // no node so first = null
        assertNull(dLinkList.last); // same
        assertEquals(dLinkList.n,0); // no node so -> 0
    }

    /**
     * testToString test
     * */

    @Test
    void testToString() {
        DLinkList<Integer> dll = new DLinkList<>();
        dll.addFirst(1);
        dll.addFirst(8);
        dll.addFirst(66);
        System.out.println(dll);
        dll.removeFirst();
        dll.removeFirst();
        System.out.println(dll);
        dll.removeFirst();
        //System.out.println(dll);// error because there is no node , return null



    }
}