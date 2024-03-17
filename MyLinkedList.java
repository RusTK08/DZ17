import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;



/**
 * MyLinkedList
 */
public class MyLinkedList<T> implements Iterable<T>{
    private List<T> list;
    private int index;
    public MyLinkedList() {
        this.list = new LinkedList<>();
        this.index = 0;
    }
    public void add(T item){
        list.add(item);
    }
    // public <T> getValue(){
    //     return list.get(index);
    // }

    public void removeValue(int i){
        list.remove(i); 
        //T str = list.remove(i);
        //System.out.println(str);
        //System.out.println(list);
    }
    @Override
    public Iterator<T> iterator(){
        Iterator<T> it = new Iterator<T>() {
            // private int index = 0;
            
            public boolean hasNext(){
                return index < list.size();
            }
            public T next(){
                return list.get(index++);
            }
        };
        
        return it;
        
    }
        public void print(){
        Iterator<T> iterator1 = list.iterator();
        while (iterator1.hasNext()) { // Проверяем, есть ли следующий элемент
            T number = iterator1.next(); // Получаем следующий элемент
            System.out.println(number);
        }}
    
}