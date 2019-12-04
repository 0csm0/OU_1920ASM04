public class SpecialMeal extends Meal {
    public Double discountPercent;

    public SpecialMeal(String name, Double price, Double discountPercent) {
        super(name, price);
        this.discountPercent = discountPercent;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String toString() {
        return super.toString() + " and " + this.getDiscountPercent() + "%";
    }
    
    
}