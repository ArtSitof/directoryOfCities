public class City {
    private String nameOfCity;
    private String nameOfRegion;
    private String district;
    private int population;
    private String foundation;

    public City(String nameOfCity, String nameOfRegion, String district, int population, String foundation ) {
        this.nameOfCity = nameOfCity;
        this.nameOfRegion = nameOfRegion;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public void setNameOfRegion(String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "nameOfCity='" + nameOfCity + '\'' +
                ", nameOfRegion='" + nameOfRegion + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
