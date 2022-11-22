public class Biscuits extends Goodies{
    private String flavor;
    private String gluten;

    public Biscuits(int id, String description, float price, String flavor, String gluten) {
        super(id, description, price);
        this.flavor = flavor;
        this.gluten = gluten;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getGluten() {
        return gluten;
    }

    public void setGluten(String gluten) {
        this.gluten = gluten;
    }

    @Override
    public String toString() {
        return "Biscuits{" +
                "flavor='" + flavor + '\'' +
                ", gluten='" + gluten + '\'' +
                '}';
    }
}
