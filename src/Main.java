import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Этап 1
        // Загрузка данных справочника
//        UtilsForDirectory.createAListOfCities().forEach(System.out::println);

        // Этап 2
        // Сортировки
//        List<City> directoryOfCities = UtilsForDirectory.createAListOfCities();
        //Сортировка по имени города
//        sortByNameOfCity(directoryOfCities);
//        printDirectoryOfCities(directoryOfCities);
        // Сортировка по федеральному округу и имени города
//        sortByDistrictAndNameOfCity(directoryOfCities);
//        printDirectoryOfCities(directoryOfCities);

        // Этап 3
        // Поиск города с наибольшим количеством жителей
        List<City> directoryOfCities = UtilsForDirectory.createAListOfCities();
        // Вариант 1
//        System.out.println(directoryOfCities.stream().max(Comparator.comparing(City::getPopulation)));
        // Вариант 2
        City maxPopulation = maxPopulation(directoryOfCities.toArray(new City[directoryOfCities.size()]));
        System.out.println("Наибольшее количество жителей в городе " + maxPopulation.getNameOfCity()
                    + " составляет - " + maxPopulation.getPopulation() + " человек.");

    }

    // Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра
    public static void sortByNameOfCity(List<City> listCities) {
        listCities.sort((o1, o2) -> o2.getNameOfCity().compareToIgnoreCase(o1.getNameOfCity()));
    }

    // Сортировка списка городов по федеральному округу и имени города внутри каждого федерального округа
    // в алфавитном порядке по убыванию с учетом регистра
    public static void sortByDistrictAndNameOfCity(List<City> listCities) {
        listCities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getNameOfCity));
    }

    // Вывод справочника городов в консоль
    public static void printDirectoryOfCities(List<City> listCities) {
        for(City c : listCities) {
            System.out.println(c);
        }
    }

    // Поиск города с наибольшим количеством жителей
    public static City maxPopulation(City[] array) {
        if(array.length == 2) {
            return array[0].getPopulation() > array[1].getPopulation() ? array[0] : array[1];
        }
        City subMax = maxPopulation(Arrays.copyOfRange(array, 1, array.length));
            return array[0].getPopulation() > subMax.getPopulation() ? array[0] : subMax;
    }
}
