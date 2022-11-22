public class Chocolates extends Goodies{
    private String type;
    private double amount;

    public Chocolates(int id, String description, float price, String type, double amount) {
        super(id, description, price);
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Chocolates{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
