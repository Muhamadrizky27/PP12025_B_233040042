package P3.LATIHAN;

public class listMain {
    public static void main(String[] args) {
        strukturList List = new strukturList();
        List.addTail(1);
        List.addTail(9);
        List.addTail(5);
        List.addTail(7);

        System.out.println();
        List.displayElement();

        // Test1 A
        strukturList List1 = new strukturList();
        List1.addTail(3);
        List1.addTail(2);
        List1.addTail(1);

        System.out.println();
        List1.displayElement();

        // Test1 B
        strukturList List2 = new strukturList();
        List2.addTail(1);
        List2.addTail(4);
        List2.addTail(5);
        List2.addTail(7);

        System.out.println();
        List2.displayElement();

        // Test2
        strukturList List3 = new strukturList();
        List3.addHead(5);
        List3.addHead(4);
        List3.addHead(3);

        System.out.println();
        List3.displayElement();

        // Test3 A
        strukturList List4 = new strukturList();
        List4.addHead(1);
        List4.addHead(2);
        List4.addHead(3);

        System.out.println();
        List4.displayElement();

        // Test3 B
        strukturList List5 = new strukturList();
        List5.addHead(7);
        List5.addHead(5);
        List5.addHead(4);
        List5.addHead(1);

        System.out.println();
        List5.displayElement();
    }
}

class strukturList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void displayElement() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}