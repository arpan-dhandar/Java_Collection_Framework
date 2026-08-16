import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        System.out.println("Original List: " + list);

        for (String item: list){
            System.out.println(item);

            if(item.equals("Mango")){
                list.add("Cherry");
                System.out.println("Added Cherry while reading...");
            }
        }
        System.out.println("Updated List: " + list);
    }
}
