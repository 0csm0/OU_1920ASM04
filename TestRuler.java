public class TestRuler {
    public static void main(String[] args) {
        Ruler aRuler = new Ruler("Brand A", 30);
        System.out.println("A Ruler object has been created: brand is "+aRuler.getBrand()+", length is " + aRuler.getLength());
    }
}