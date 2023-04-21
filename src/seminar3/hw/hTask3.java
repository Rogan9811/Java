package seminar3.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hTask3 {
    public static void foo() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = hTask2.fillList(10);
        Collections.sort(arr);
        for (int i : arr) System.out.printf("%d, ", i);
        System.out.println(" ");
        System.out.println("Min:");
        System.out.println(arr.get(0));
        System.out.println(" ");
        System.out.println("Midle:");
        System.out.println(arr.get(arr.size() / 2));
        System.out.println(" ");
        System.out.println("Average:");
        System.out.println(averageList(arr));
        System.out.println("");
        System.out.println("Max:");
        System.out.println(arr.get(arr.size() - 1));
    }

    public static int averageList(ArrayList<Integer> arr) {
        double result = 0;
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        return (int) (result / arr.size());
    }
}
