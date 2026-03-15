// AssignmentTask4: ID Generator
public class AssignmentTask4 {
    // Task 4
    public static Node idGenerator(Node head1, Node head2, Node head3)
    {
        Node id = null;
        Node temp3 = head3;
        for (Node temp2 = head2; temp2 != null; temp2 = temp2.next)
        {
            Node aNode = new Node(((Integer) temp2.elem + (Integer) temp3.elem) % 10);
            temp3 = temp3.next;

            if (id == null) id = aNode;
            else
            {
                for (Node temp = id; temp != null; temp = temp.next)
                {
                    if (temp.next == null)
                    {
                        temp.next = aNode;
                        break;
                    }
                }
            }
        }

        for (Node ntemp = head1; ntemp != null; ntemp = ntemp.next) {
            Node aNode = new Node(ntemp.elem);
            aNode.next = id;
            id = aNode;
        }

        return id;
    }
    // Task Over

    // NOTE: if you find any issue with the driver code please inform AIB
    // DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    // DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[] { 0, 3, 2, 2 });
        Node head2 = LinkedList.createList(new Integer[] { 5, 2, 2, 1 });
        Node head3 = LinkedList.createList(new Integer[] { 4, 3, 2, 1 });

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[] { 0, 3, 9, 1 });
        Node head5 = LinkedList.createList(new Integer[] { 3, 6, 5, 7 });
        Node head6 = LinkedList.createList(new Integer[] { 2, 4, 3, 8 });

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
