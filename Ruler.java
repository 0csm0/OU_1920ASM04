public class Ruler {
    private String brand;
    private int length;

    Ruler(String brand, int length) {
        this.brand = brand;
        this.length = length;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getLength() {
        return this.length;
    }
}