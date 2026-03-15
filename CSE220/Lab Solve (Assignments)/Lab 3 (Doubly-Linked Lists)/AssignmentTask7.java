public class AssignmentTask7 {

    // SUBMIT ONLY THIS METHOD
// Task 7
public static void rangeMove(DNode dh, int start, int end) {
    DNode ref = null;
    for (DNode check = dh.next; check != ref; check = check.next) {
        if ((int) check.elem <= end && (int) check.elem >= start) {
            if (ref == null) {
                if (check == dh) {
                    return;
                }
                ref = check;
            }
            DNode temp = check.prev;
            check.prev.next = check.next;
            check.next.prev = check.prev;
            dh.prev.next = check;
            check.prev = dh.prev;
            check.next = dh;
            dh.prev = check;
            check = temp;
        }
    }
}
// Task Over

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = { 5, 3, 7, 1, 9, 6, 2, 4 };
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = { 3, 1, 9, 2, 4, 5, 7, 6 };
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        // Running the Range Move with [5,7] range
        rangeMove(dh, 5, 7);
        // Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
