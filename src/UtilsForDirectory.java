import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilsForDirectory {
    public static List<City> createAListOfCities() {
        List<City> cities = new ArrayList<>();
        File file = new File("city_ru.csv");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                cities.add(splitIntoACity(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File \""+ file + "\" is not found!");
        }
        return cities;
    }

    public static City splitIntoACity(String input) {
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter(";");
        scanner.skip("\\d*");
        String nameOfCity = scanner.next();
        String nameOfRegion = scanner.next();
        String district = scanner.next();
        int population = scanner.nextInt();
        String foundation = null;
        if (scanner.hasNext()) {
            foundation = scanner.next();
        }
        scanner.close();
        return new City(nameOfCity, nameOfRegion, district, population, foundation);
    }
}
