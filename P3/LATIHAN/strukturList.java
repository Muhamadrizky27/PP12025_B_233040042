package P3.LATIHAN;

public class strukturList {
    Node HEAD;

    public void addTail(int data){
    Node posNode=null, curNode=null;
    
    Node newNode = new Node(data);
    if (HEAD == null) {
        HEAD = newNode;

    } else {
        curNode = HEAD;
        while (curNode!= null) {
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
    
       public void displayElement() {
        Node curNode   = HEAD;
        while (curNode != null) {
            System.out.print(curNode.GetData()+ " ");
            curNode = curNode.GetNext();
        }   
       }
}