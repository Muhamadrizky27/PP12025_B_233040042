public class NodeMainTest2 {
    public static void main(String[] args) {
        
        // Membuat  2 buah Node n1 & n2 
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);

        // Membuat relasi Node n1 & n2
        n1.SetNext(n2);
        n2.SetNext(n3);
        n3.SetNext(n4);
        n4.SetNext(n5);
    

        // Menampilkan Node n1 & n2 dengan Pointer p
        Node p = n1;
        while(p != null)
        {

            System.out.printf("%d ", p.GetNIlai());
            p = p.GetNext(); 
        }

    }
}
