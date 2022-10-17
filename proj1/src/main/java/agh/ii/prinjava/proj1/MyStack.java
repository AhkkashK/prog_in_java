package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.DLinkList;
import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * Interface MyStack
 * The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out.
 * @param <E> The type of nodes held in this collection.
 */

public interface MyStack<E> {

    /**
     * Used to pop a node from the Stack
     * @return returns the element present at the top of the stack and then removes it
     */
    E pop();

    /**
     * Used to push a node into the Stack
     * @param x The node we want to push
     */

    void push(E x);

    /**
     * Used to check and verify if a Stack is empty or not
     * @return It returns True if the Stack is empty else it returns False
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Used to get the number of node in stack
     * @return return number of node in stack
     */

    int numOfElems();

    /**
     * Used to get the first element of the stack
     * @return return the first element of the stack
     */


    E peek();

    DLinkList<E> getElems();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }

}
