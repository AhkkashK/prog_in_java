package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

import java.util.NoSuchElementException;

public class MyStackDLLBImpl<E> implements MyStack<E> {

    /**
     * elems is a DLL
     * */

    private DLinkList<E> elems;

    /**
     * Used to pop a node from the Stack
     * @return returns the element present at the top of the stack and then removes it
     */

    @Override
    public E pop() {
        if(elems!=null){
            return elems.removeFirst();
        }
        throw new NoSuchElementException("No node");
    }

    /**
     * Used to push a node into the Stack
     * @param x The node we want to push
     */

    @Override
    public void push(E x) {
        if(elems == null){
            elems = new DLinkList<>();
        }
        elems.addFirst(x);
    }

    /**
     * Used to get the number of node in stack
     * @return return number of node in stack
     */

    @Override
    public int numOfElems() {
        if(elems!=null){
            return elems.n;
        }
        throw new NoSuchElementException("No node");
    }


    /**
     * Used to get the first element of the stack
     * @return return the first element of the stack
     */

    @Override
    public E peek() {
        if((elems!=null)&&(elems.first!=null)){
            return elems.getFirst();
        }
        throw new NoSuchElementException("No node");
    }


    public DLinkList<E> getElems() {
        if(elems!=null){
            return elems;
        }
        throw new NoSuchElementException("No node");
    }


    @Override
    public String toString() {
        if(elems!=null) return elems.toString();
        throw new NoSuchElementException("No node");
    }
}
