package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    public DLinkList<E> elems;


    @Override
    public void enqueue(E x) {
        if(elems == null){
            elems = new DLinkList<>();
        }
        elems.addLast(x);
    }

    @Override
    public E dequeue() {
        if(elems!=null){
            return elems.removeFirst();
        }
        return null;
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

    public static void main(String[] args) {
        MyQueue<Integer> q = MyQueue.create();
        q.enqueue(5);
        q.enqueue(9);
        DLinkList<Integer> value= q.getElems();
        System.out.println(value.getFirst());
        System.out.println(value);


    }
}
