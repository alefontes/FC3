package doublylinkedlist;

public class DoublyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createDoublyLinkedList(int nodeValue) {
    head = new Node(); 
    Node node = new Node();
    node.next = null;
    node.back=null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  // Insert Method DoublyLinkedList
  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createDoublyLinkedList(nodeValue);
      return;
    } else if (location == 0) {
      node.back=null;
      node.next = head;
      head.back=node;
      head = node;
    } else if (location >= size) {
      node.next = null;
      node.back=tail;
      tail.next = node;
      tail = node ;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      node.next=tempNode.next;
      node.back=tempNode;
      node.next.back=node;
      tempNode.next=node;
    }
    size++;
  }

  // DoublyLinkedList Traversal
  public void traverseDoublyLinkedList() {
    if (head == null) {
      System.out.println("SLL does not exist!");
    } else {
      Node tempNode = head;
      for (int i = 0; i<size; i++) {
        System.out.print(tempNode.value);
        if (i != size - 1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("\n");
  }

  // DoublyLinkedList ReverseTraversal
  public void reversetraverseDoublyLinkedList() {
    if (head == null) {
      System.out.println("SLL does not exist!");
    } else {
      Node tempNode = tail;
      for (int i = 0; i<size; i++) {
        System.out.print(tempNode.value);
        if (i != size - 1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.back;
      }
    }
    System.out.println("\n");
  }

  // Search for a node

  boolean searchNode(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for (int i=0; i<size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("Found the node at location: " +i+"\n");
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found! ");
    return false;
  }

  //Deleting a node from DoublyLinkedList
  public void deletionOfNode(int location) {
    if (head == null) {
      System.out.println("The SLL does not exist");
      return;
    } else if (location == 0) {
      head=null;
      tail=null;
      head=head.next;
      head.back=null;
    } else if (location >= size) {
      head=null;
      tail=null;
      tail=tail.back;
      tail.next=null;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      tempNode.next = tempNode.next.next;
      tempNode.next.back=tempNode;
      size--;
    }
  }

//  Delete Entire DoublyLinkedList
public void deleteSLL() {
  head = null;
  tail = null;
  System.out.println("The SLL deleted successfully");
  System.out.println("");
}
}