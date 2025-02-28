class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int GetData() {
        return data;
    }

    public Node GetNext() {
        return next;
    }

    public void SetNext(Node next) {
        this.next = next;
    }
}

public class Procedur {
    Node HEAD;

    public void addTail(int data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);

        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.GetNext();
            }
            posNode.SetNext(newNode);
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.SetNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(int data, int position) {
        Node posNode = null, curNode = HEAD;
        int i = 1;

        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            if (position == 1) {
                newNode.SetNext(HEAD);
                HEAD = newNode;
            } else {
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.GetNext();
                    i++;
                }
                if (posNode != null) {
                    posNode.SetNext(newNode);
                    newNode.SetNext(curNode);
                }
            }
        }
    }
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.GetData() + " ");
            curNode = curNode.GetNext();
        }
        System.out.println();
    }
}

