package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    Node<E> first;
    Node<E> last;
    int n= 0;
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;


        public Node(){
            next = null;
            prev = null;
        }

        public Node(T e){
            this.elem = e;
            next = null;
            prev = null;
        }
    }

    public DLinkList(){
        first = null;
        last = null;
    }

    public void addFirst(E e){
        if(first != null){
            Node<E> a = new Node<>(e);
            a.next = first;
            first.prev = a;
            first = a;
        }
        else{
            first = new Node<>(e);
            last =first;
        }
        n++;
    }

    public void addLast(E e){
        if(first != null){
            Node<E> temp =first;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node<>(e);
            last = temp.next;
            last.prev = temp;
            n++;
        }
        else{
            first = new Node<>(e);
            last =first;
            n++;
        }
    }

    public E removeFirst(){
        if(first != null){
            E value = first.elem;
            Node<E> temp = first;
            if(first.next != null){
                first = temp.next;
                first.prev = null;
                n--;
                return value;
            }else{
                first = null;
                last = null;
                n--;
                return value;
            }

        }else{
            System.out.println("there is no node, so no node to remove");
            return null;
        }
    }

    public E removeLast(){
        if((first != null)&&(last!= null)){
            E value = last.elem;
            Node<E> temp = last;
            if(last.prev != null){
                last =temp.prev;
                last.next = null;
                n--;
                return value;
            }else{
                first = null;
                last = null;
                n--;
                return value;
            }

        }
        System.out.println("there is no node, so no node to remove");
        return null;
    }


    public E getFirst() {
        return first.elem;
    }

    public E getLast() {
        return last.elem;
    }

    public String toString() {
        String result = " ";
        Node<E> current = first;
        if (first == null) {
            System.out.println( "No node");
            return null;
        } else {

            while (current.next != null) {
                result += current.elem;
                result += " -> ";
                current = current.next;
            }
            return "List: " + result + current.elem;
        }
    }

    public static void main(String[] args) {
        /*DLinkList<Integer> dll = new DLinkList<>();
        Node<Integer> temp = dll.first;
        dll.addFirst(1);
        dll.addFirst(8);
        dll.addFirst(66);
        System.out.println(dll);
        dll.removeFirst();
        dll.removeFirst();

        System.out.println(dll);
        dll.removeFirst();
        System.out.println(dll);*/

        DLinkList<Integer> dll = new DLinkList<>();
        dll.addFirst(1);
        dll.addFirst(8);
        dll.addFirst(66);
        System.out.println(dll);
        dll.removeFirst();
        dll.removeFirst();
        System.out.println(dll);
        dll.removeFirst();
      //  System.out.println(dll);
    }


}
