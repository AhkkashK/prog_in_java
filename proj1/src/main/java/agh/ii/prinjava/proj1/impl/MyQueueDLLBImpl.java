package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    public DLinkList<E> elems;


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
        return null;
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
        return elems.getFirst();
    }

    /**
     * get the DLL
     * @return DLinkList
     * */

    public DLinkList<E> getElems() {
        return elems;
    }

    public static void main(String[] args) {
        MyQueue<Integer> q = MyQueue.create();
        q.enqueue(5);
        q.enqueue(9);
        DLinkList<Integer> value= q.getElems();
        System.out.println(value.getFirst());
        System.out.println(value);


    }
}
