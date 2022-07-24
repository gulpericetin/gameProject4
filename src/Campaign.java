public class Campaign {
    private int id;
    private String name;
    private double discountedRate;

    public Campaign() {
    }

    public Campaign(int id, String name, double discountedRate) {
        this.setId(id);
        this.setName(name);
        this.setDiscountedRate(discountedRate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountedRate() {
        return discountedRate;
    }

    public void setDiscountedRate(double discountedRate) {
        this.discountedRate = discountedRate;
    }
}
