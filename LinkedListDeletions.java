package com.anurag;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

   //----------------DELETION----------------->>>>>>>>>>
    //DELETE ELEMENT AT FIRST
    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;

        return val;
    }

    //DELETE ELEMENT AT LAST
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);

        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    //DELETE ELEMENT AT A PARTICULAR INDEX
    public int delete(int index){
        if(index == 0){
            return  deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index - 1);  //prev is the previous element from the element that's to be removed
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }




}
