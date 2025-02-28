public class Node {
    int data;
    Node next;

    //Inisialisasi Node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node GetNext() {
        return this.next;
    }

    // Setter & Getter 
    public void SetNext(Node next) {
        this.next = next;
    }

    public int GetData() {
        return this.data;
    }
}