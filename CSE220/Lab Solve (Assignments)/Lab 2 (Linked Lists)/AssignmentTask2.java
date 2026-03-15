
// AssignmentTask2: Organize Books
import java.util.Arrays;

public class AssignmentTask2 {

    // MUST SUBMIT this method
    public static Node organizeBooks(Node head, Integer[] popularity) {
        if (head == null || head.next == null) return head;
        Node newHead = head;
        Node current = head.next;
        newHead.next = null;

        for (int i = 1; i < popularity.length; ++i) {
            Node next = current.next;
            int key = popularity[i];
            Node prev = null;
            Node pointer = newHead;
            int j = 0;
            while (pointer != null && popularity[j] >= key)
            {
                prev = pointer;
                pointer = pointer.next;
                j++;
            }

            if (prev == null)
            {
                current.next = newHead;
                newHead = current;
            }
            else
            {
                prev.next = current;
                current.next = pointer;
            }
            
            for (int k = i; k > j; --k)popularity[k] = popularity[k - 1];
            popularity[j] = key;
            current = next;
        }
        return newHead;
    }
    //Method Over

    // NOTE: if you find any issue with the driver code please inform AIB
    // DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    // DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=================Test Case 1=================");
        Node books = LinkedList.createList(new String[] { "Dune", "IT", "Coraline", "Inferno", "Twlight" });
        Integer[] arr = { 8, 10, 5, 10, 6 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books);
        System.out.println(Arrays.toString(arr));

        System.out.println("\nExpected Output");
        System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");

        System.out.println("Your Output");
        books = organizeBooks(books, arr);
        LinkedList.printLL(books);

        System.out.println("=================Test Case 2=================");
        Node books2 = LinkedList.createList(new String[] { "Hamlet", "Persuasion", "It", "Dracula", "Beloved" });
        Integer[] arr2 = { 7, 9, 9, 6, 7 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nExpected Output");
        System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

        System.out.println("Your Output");
        books2 = organizeBooks(books2, arr2);
        LinkedList.printLL(books2);

        System.out.println("=================Test Case 3=================");
        Node books3 = LinkedList.createList(new String[] { "Matilda", "Franny", "Foundation", "Carrie", "Misery" });
        Integer[] arr3 = { 5, 8, 8, 10, 6 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nExpected Output");
        System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

        System.out.println("Your Output");
        books3 = organizeBooks(books3, arr3);
        LinkedList.printLL(books3);

    }
}
