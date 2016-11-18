/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
Set<Node> nodeSet = new HashSet<>();    
if(head == null) {
    return false;
}
nodeSet.add(head);
Node currentNode = head.next;
while(currentNode != null) {
    if(!nodeSet.add(currentNode)){
        return true;
    }
    nodeSet.add(currentNode);
    currentNode = currentNode.next;
}
return false;
}
