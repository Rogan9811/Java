package seminar3.work;

import java.util.*;

//Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.
public class Task1 {
//    public static int[] randList(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 10);
//        }
//        System.out.println(arr);
//        return arr;
//    }

//    public static void sortAndPrint() {
//        int[] arr = new int[10];
//        randList(arr);
//        Arrays.stream(arr).sorted();
//        System.out.println(arr);;
//    }


    public static void foo() {
        List<Integer> arrNums = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arrNums.add(rnd.nextInt(11));
        }
        System.out.println(arrNums);
        Collections.sort(arrNums);
        System.out.println(arrNums);

    }
}
