package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.DLinkList;
import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * Interface MyQueue
 * Queue is a data-structure. It's composed of node. In a queue the first element to go in is the first element to go out
 * */

public interface MyQueue<E> {

    /**
     * add a node at the end of the queue  with a value given
     * @param x value
     * */

    void enqueue(E x);

    /**
     *remove a node at the start of the queue
     *@return  return value of the node
     * */

    E dequeue();


    /**
     * check if the queue is empty
     *@return  return boolean
     *
     * */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     *@return  returns number of node in queue
     * */

    int numOfElems();

    /**
     *@return return the first element of the queue
     */

    E peek();

     DLinkList<E> getElems();




    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
