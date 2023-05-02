package seminar6.HW;

import java.util.*;

public class laptopsMag {
    public static void mainLapt() throws Exception {

        marketLaptops laptop1 = new marketLaptops("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        marketLaptops laptop2 = new marketLaptops("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        marketLaptops laptop3 = new marketLaptops("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        marketLaptops laptop4 = new marketLaptops("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        marketLaptops laptop5 = new marketLaptops("Xiaomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        marketLaptops laptop6 = laptop1;

        Set<marketLaptops> unicLaptop = new HashSet<marketLaptops>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        unicLaptop.add(laptop6);
        System.out.println(laptop1.equals(laptop6));
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicLaptop.size());


        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: Объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("Объем накопителя: ");
        int storUser = sc.nextInt();

        System.out.println("Диагональ: ");
        double digUser = sc.nextDouble();

        for(marketLaptops lap: unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();

    }
}
