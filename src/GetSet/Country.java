package GetSet;

public class Country {
    CountryCreate Ukraine = new CountryCreate("Ukraine", 6036628.0, 38000000, "UKR");
    CountryCreate Gruzie = new CountryCreate("Gruzie", 69700.0, 3713000, "GEO");


}  class CountryCreate {
    private final String name;
    private double area;
    private int population;
    private String countryCode;

    public CountryCreate (String name, double area, int population, String countryCode) {
        this.name = name;
        if (area>0 ){
            this.area = area;
        }
        if (population>0 ){
            this.population = population;
        }
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setArea(double area) {
        if (area <0) {
            System.out.println("Chyba!!!");
            return;
        }
        this.area = area;
    }

    public void setPopulation(int population) {
        if (population <0) {
            System.out.println("Chyba!!!");
            return;
        }
        this.population = population;
    }

    public void setCountryCode(String countryCode) {
        if (countryCode.length() != 3) {
            System.out.println("Chyba!!!");
            return;
        }
        this.countryCode = countryCode.toUpperCase();
    }
}
