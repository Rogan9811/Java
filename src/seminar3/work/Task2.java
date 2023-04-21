package seminar3.work;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа
public class Task2 {
    public static void deli() {
        ArrayList arr = new ArrayList<String>();
        arr.add(1);
        arr.add("Hello world");
        arr.add("g84-AR");
        arr.add("v");
        arr.add(121);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}
