public class StationeryShop {
    private Ruler[] ruler;

    public StationeryShop(Ruler[] ruler) {
        this.ruler = ruler;
    }

    public void setRuler(Ruler[] ruler) {
        this.ruler = ruler;
    }

    public Ruler[] getRuler() {
        return this.ruler;
    }

    public void displayRuler(int index) {
        Ruler selected = this.ruler[index];
        System.out.println(
                "Ruler number " + index + "\nbrand : " + selected.getBrand() + "\nlength : " + selected.getLength());
    }

    public int brandCount(String brand) {
        int count = 0;
        for (int i = 0; i < ruler.length; i++) {
            Ruler r = ruler[i];
            if (r.getBrand() == brand) {
                count++;
            }
        }
        return count;
    }
    
    public void longRulers() {
        
        
    }
}