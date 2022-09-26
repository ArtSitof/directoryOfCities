import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Этап 1
        // Загрузка данных справочника
        UtilsForDirectory.createAListOfCities().forEach(System.out::println);

        // Этап 2
        // Сортировки
        List<City> directoryOfCities = UtilsForDirectory.createAListOfCities();
        //Сортировка по имени города
        sortByNameOfCity(directoryOfCities);
        printDirectoryOfCities(directoryOfCities);
        // Сортировка по федеральному округу и имени города
        sortByDistrictAndNameOfCity(directoryOfCities);
        printDirectoryOfCities(directoryOfCities);
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
}
