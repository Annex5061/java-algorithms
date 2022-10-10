package com.anurag;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }


    //-------------------INSERTION---------------->>>>>>>>>
    //INSERT ELEMENT AT FIRST
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){ //if it's true it means that first element is being added
            tail = head;
        }

        size += 1;
    }

    //INSERT ELEMENT AT LAST
    public void insertLast(int val){
        if(tail == null){    //IF LIST IS EMPTY INSERT AT FIRST
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    //INSERT ELEMENT AT A PARTICULAR INDEX
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
          for (int i = 1; i < index; i++) {
              temp = temp.next;
          }

          Node node = new Node(val, temp.next);  //pass the value of new node and it's next element will be current.next i.e. temp.next
          temp.next = node;

          size++;
    }


    //QUESTION 1
    //INSERT USING RECURSION
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);  //next of the temp node will be the current node
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
  
  private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

}
