package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    @Override
    public E pop() {
        if(elems!=null){
            return elems.removeFirst();
        }
        return null;
    }

    @Override
    public void push(E x) {
        if(elems == null){
            elems = new DLinkList<>();
        }
        elems.addFirst(x);
    }

    @Override
    public int numOfElems() {
        return elems.n;
    }

    @Override
    public E peek() {
        return elems.getFirst();
    }

    public DLinkList<E> getElems() {
        return elems;
    }
}
