package seminar2.work;

import java.util.Scanner;

public class Task2 {
    public static String compress(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = scanner.next();
        int count = 1;
        //StringBuilder arr = new StringBuilder();
        String arr = "";
        char last = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == last){
                count ++;
            } else{
                arr += last + count;
                count = 1;
                last = str.charAt(i);
            }
        }
        return  arr + last + count; //.append(last + count);
    }
}
