package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

import java.util.NoSuchElementException;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {

    /**
     * elems is a DLL
     * */

    private DLinkList<E> elems;


    /**
     * add a node with a value given  at the end of the queue
     * @param x
     * */
    @Override
    public void enqueue(E x) {
        if(elems == null){
            elems = new DLinkList<>();
        }
        elems.addLast(x);
    }


    /**
     * remove a node at the start of the queue and return his value
     * @return return value
     *
     * */

    @Override
    public E dequeue() {
        if(elems!=null){
            return elems.removeFirst();
        }
        throw new NoSuchElementException("No node");
    }

    /**
     * return number of node in the queue
     * @return n
     * */

    @Override
    public int numOfElems() {
        return elems.n;
    }

    /**
     * return the value of the first node in the queue
     * @return value
     * */

    @Override
    public E peek() {
        if((elems!=null)&&(elems.first!=null)){
            return elems.getFirst();
        }
        throw new NoSuchElementException("No node");
    }

    /**
     * get the DLL
     * @return DLinkList
     * */

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

    public static void main(String[] args) {
        MyQueue<Integer> q = MyQueue.create();
        q.enqueue(5);
        q.enqueue(9);
        System.out.println(q.toString());
        /*DLinkList<Integer> value= q.getElems();
        System.out.println(value.getFirst());
        System.out.println(value);*/


    }
}
