public class StrukturList{
    Node2 HEAD;

    public void addTail(double data) {
        Node2 posNode = null, curNode = null;
        Node2 newNode = new Node2(data);

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

    public void addHead(double data) {
        Node2 newNode = new Node2(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.SetNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(double data, double position) {
        Node2 posNode = null, curNode = HEAD;
        double i = 1;

        Node2 newNode = new Node2(data);
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
        Node2 curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.GetData() + " ");
            curNode = curNode.GetNext();
        }
        System.out.println();
    }
}