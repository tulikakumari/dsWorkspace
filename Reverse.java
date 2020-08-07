class Reverse{
    static Node head;
   static class Node{
       int data;
       Node next;
       Node(int d)
       {
           data = d;
           next=null;
       }
   }
   Node rev(Node node)
   {
       Node prev = null; 
       Node current = node; 
       Node next = null; 
       while (current != null) { 
           next = current.next; 
           current.next = prev; 
           prev = current; 
           current = next; 
       } 
       node = prev; 
       return node; 
   }
   void printList(Node node) 
   { 
       while (node != null) { 
           System.out.print(node.data + " "); 
           node = node.next; 
       } 
   } 
   public static void main(String[] args) 
   { 
       Reverse list = new Reverse(); 
       list.head = new Node(23); 
       list.head.next = new Node(35); 
       list.head.next.next = new Node(40); 
       list.head.next.next.next = new Node(200); 
       list.head.next.next.next.next  = new Node(250); 

 
       System.out.println("Given Linked list"); 
       list.printList(head); 
       head = list.rev(head); 
       System.out.println(""); 
       System.out.println("Reversed linked list "); 
       list.printList(head); 
   } 

}