public class Tribe {

    private String masterName;
    private long population;
    private double economicWealth;
    private double hateLevel;
    private double culturalRichness;


    public Tribe (String name) {
        this.masterName = name;
        this.population = 30;
        this.economicWealth = 5d;
        this.hateLevel = 0;
        this.culturalRichness = 0;
    }

    public String getName() {
        return masterName;
    }

    public void setName(String name) {
        this.masterName = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getEconomicWealth() {
        return economicWealth;
    }

    public void setEconomicWealth(double economicWealth) {
        this.economicWealth = economicWealth;
    }

    public double getHateLevel() {
        return hateLevel;
    }

    public void setHateLevel(double hateLevel) {
        this.hateLevel = hateLevel;
    }

    public double getCulturalRichness() {
        return culturalRichness;
    }

    public void setCulturalRichness(double culturalRichness) {
        this.culturalRichness = culturalRichness;
    }
}
