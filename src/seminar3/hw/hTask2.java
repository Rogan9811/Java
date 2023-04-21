package seminar3.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class hTask2 {
    public static ArrayList<Integer> fillList(int count) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 15; i++) arr.add((int)(Math.random() * 100));
        for (int i: arr) {
            System.out.printf("%d, ", i);
        }
        System.out.println(" ");
        return arr;
    }

    public static void delDigit() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = fillList(10);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) arr.remove(i);
        }
        for (int i: arr) {
            System.out.printf("%d, ", i);
        }
    }
}
