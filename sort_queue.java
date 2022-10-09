// Java program to implement sorting a
// queue data structure
import java.util.LinkedList;
import java.util.Queue;
class GFG
{
    // Queue elements after sortIndex are 
    // already sorted. This function returns
    // index of minimum element from front to
    // sortIndex
    public static int minIndex(Queue<Integer> list,
                                     int sortIndex)
    {
    int min_index = -1;
    int min_value = Integer.MAX_VALUE;
    int s = list.size();
    for (int i = 0; i < s; i++)
    {
        int current = list.peek();
          
        // This is dequeue() in Java STL
        list.poll();
  
        // we add the condition i <= sortIndex
        // because we don't want to traverse
        // on the sorted part of the queue,
        // which is the right part.
        if (current <= min_value && i <= sortIndex)
        {
            min_index = i;
            min_value = current;
        }
        list.add(current); 
    }
    return min_index;
}
      
    // Moves given minimum element 
    // to rear of queue
    public static void insertMinToRear(Queue<Integer> list,
                                             int min_index)
     {
        int min_value = 0; 
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
        int current = list.peek();
        list.poll();
        if (i != min_index)
            list.add(current);
        else
            min_value = current;
        }
        list.add(min_value);
    }
      
    public static void sortQueue(Queue<Integer> list)
    {
        for(int i = 1; i <= list.size(); i++)
        {
            int min_index = minIndex(list,list.size() - i);
            insertMinToRear(list, min_index);
        }
    }
  
    //Driver function
    public static void main (String[] args) 
    {
        Queue<Integer> list = new LinkedList<Integer>();
        list.add(30);
        list.add(11);
        list.add(15);
        list.add(4);
          
        //Sort Queue
        sortQueue(list);
          
        //print sorted Queue
        while(list.isEmpty()== false)
        {
            System.out.print(list.peek() + " ");
            list.poll();
        }
    }
}
