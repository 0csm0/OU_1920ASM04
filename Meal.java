public class Meal {
    private String name;
    private double price;

    public Meal(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.getName() + ": " + this.getPrice();
    } 

}