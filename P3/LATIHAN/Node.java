package P3.LATIHAN;

public class Node {
    private int data;
    private Node next;

//inisiation atribut node

    public Node(int data) {
        this.data = data;
    }

    
//setter getter

public void SetData(int data) {
    this.data = data;
}

    public int GetData() {
        return data;
    }

    


    public void SetNext(Node next) {
        this.next = next;
    }


    public Node GetNext() {
        return next;
    }



}