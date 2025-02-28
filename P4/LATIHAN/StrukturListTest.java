public class StrukturListTest {
    public static void main(String[] args) {
        Procedur list = new Procedur(); // Menggunakan class Procedur sebelumnya
        
        list.addTail(3);
        list.addTail(4);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addHead(5);

        System.out.println("Elemen List:");
        list.displayElement();

        StrukturList list2 = new StrukturList(); // Menggunakan class StrukturList sebelumnya

        list2.addTail(4.5);
        list2.addMid(3.4,1);
        list2.addHead(2.1);

        System.out.println("Elemen List:");
        list2.displayElement();
        

        StrukturList list3 = new StrukturList(); // Menggunakan class StrukturList sebelumnya

        list3.addTail(4.5);
        list3.addTail(5.5);
        list3.addMid(2.1,1);
        list3.addMid(1.1, 2);
        list3.addHead(3.4);

        System.out.println("Elemen List:");
        list3.displayElement();
        
    }
}