import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
public class Test {
    
    public static void main(String[] args) {
    MyLinkedList<String> list1 = new MyLinkedList<>();
    list1.add("Sena");
    list1.add("Lena");
    list1.add("Seva");
    for (String items : list1) {
        System.out.println(items);
        
    }
    list1.removeValue(2);
    System.out.println("\n");
    list1.print();
}

    
}
