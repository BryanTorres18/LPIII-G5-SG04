public class Sweet extends Biscuits{
    private String sugar;
    private String sparks;

    public Sweet(int id, String description, float price, String flavor, String gluten, String sugar, String sparks) {
        super(id, description, price, flavor, gluten);
        this.sugar = sugar;
        this.sparks = sparks;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSparks() {
        return sparks;
    }

    public void setSparks(String sparks) {
        this.sparks = sparks;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "sugar='" + sugar + '\'' +
                ", sparks='" + sparks + '\'' +
                '}';
    }
}
