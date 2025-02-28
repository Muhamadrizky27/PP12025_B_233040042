public class Node2 {
        private double data;
        private Node2 next;

        //Inisialisasi Node
        public Node2(double data) {
            this.data = data;
            this.next = null;
        }
        

        public Node2 GetNext() {
            return this.next;
        }
        
        //Setter & Getter
        public void SetNext(Node2 next) {
            this.next = next;
        }
    
        public double GetData() {
            return this.data;
        }
    }