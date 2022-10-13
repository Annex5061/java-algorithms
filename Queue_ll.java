public class Queue_ll {
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			this.next=null;}}
	
	static class Queue{
		static Node head=null,tail=null;
		static boolean isEmpty() {
			return head==null & tail==null;}
			
		static void add(int data) {
			Node p=new Node(data);
			if(tail==null) {
				tail=head=p;
				return;}
			tail.next=p;
			tail=p;}
					
		static int rem() {
			if(isEmpty()) {
				System.out.println("empty");
				return -1;}
			int front=head.data;
			if(head==null)
				tail=null;
			head=head.next;
			return front;}
		
		static int print() {
			if(head==null) {
				System.out.println("empty");
				System.exit(0);}
			return head.data;}
		
			
		public static void main(String[] args) {
			Queue q=new Queue();
			q.add(5);
			q.add(6);
			q.add(2);
			q.add(78);
			
			while(!q.isEmpty()) {
				System.out.println(q.print());
				q.rem();	}
		}
		
	}
}