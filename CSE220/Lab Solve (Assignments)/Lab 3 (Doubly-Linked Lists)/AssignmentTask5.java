public class AssignmentTask5 {

    // SUBMIT ONLY THIS METHOD
public static Node sumOddAppend(Node dh) {
    int count = 0;
    Node c = dh;
    for (Node d = c.next; d != dh; d = d.next) {
        if ((Integer) d.elem % 2 == 1) {
            count += (Integer) d.elem;
            c.next = c.next.next;
            continue;
        }
        c = c.next;
    }
    Node nF = new Node(count);
    for (Node d = dh.next; d != dh; d = d.next) {
        if (d.next == dh) {
            nF.next = dh;
            d.next = nF;
            break;
        }
    }
    return dh;
}

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = { 11, 22, 33, 44, 55, 66 };
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = { 22, 44, 66, 99 };
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);

        // Running the Sum Odd Append
        sumOddAppend(head);
        // Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
