package ArrayListDemo;

import java.util.ArrayList;

public class Main {
    public static void main(){

        ArrayList<Integer> list = new ArrayList<>();
    list.add(52);
    list.add(60);
    list.add(89);

    list.add(2, 88);
        System.out.println(list.get(2));
        for(int x: list){
            System.out.println(x);
        }
    }
}