package doublylinkedlist;

public class MainDoublyLinkedList {
  public static void main(String[] args) {
    DoublyLinkedList sLL = new DoublyLinkedList();
    
    sLL.createDoublyLinkedList(5);
    sLL.insertInLinkedList(6, 0);
    sLL.insertInLinkedList(7, 2);
    sLL.insertInLinkedList(8, 2);
    sLL.insertInLinkedList(9, 0);
    sLL.insertInLinkedList(1, 2);
    System.out.println(sLL.size);
    sLL.traverseDoublyLinkedList();
    
    sLL.createDoublyLinkedList(5);
    sLL.insertInLinkedList(6, 0);
    sLL.insertInLinkedList(7, 2);
    sLL.insertInLinkedList(8, 2);
    sLL.insertInLinkedList(9, 0);
    sLL.insertInLinkedList(1, 2);
    System.out.println(sLL.size);
    sLL.reversetraverseDoublyLinkedList();
    
    sLL.createDoublyLinkedList(5);
    sLL.insertInLinkedList(6, 0);
    sLL.insertInLinkedList(7, 2);
    sLL.insertInLinkedList(8, 2);
    sLL.insertInLinkedList(9, 0);
    sLL.insertInLinkedList(1, 2);
    sLL.deletionOfNode(3);
    System.out.println(sLL.size);
    sLL.traverseDoublyLinkedList();
    
    sLL.deleteSLL();
    sLL.createDoublyLinkedList(1);
    sLL.insertInLinkedList(2, 0);
    sLL.insertInLinkedList(3, 2);
    sLL.insertInLinkedList(4, 2);
    sLL.insertInLinkedList(5, 0);
    sLL.insertInLinkedList(6, 2);
    System.out.println(sLL.size);
    sLL.traverseDoublyLinkedList();

  }
}
    
