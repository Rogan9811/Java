package seminar3.work;

import java.util.ArrayList;
import java.util.List;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
public class Task4 {
    public static void planets() {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Venus");

        ArrayList<Integer> countPlanet = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();

        for (String planet : planets) {
            int pos = resultList.indexOf(planet);
            if (pos >= 0) {
                countPlanet.set(pos, countPlanet.get(pos) + 1);
            } else {
                resultList.add(planet);
                countPlanet.add(1);
            }
        }
        printPlanetCount(resultList, countPlanet);
    }

    public static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }
}
