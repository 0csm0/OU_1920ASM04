public class StationeryShop {
    private Ruler[] ruler;

    public StationeryShop(Ruler[] ruler) {
        this.ruler = ruler;
    }

    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

    public Ruler[] getRuler() {
        return this.ruler;
    }

    public void displayRuler(int index) {
        Ruler selected = this.ruler[index];
        System.out.println(
           "Ruler number " + index+"\nbrand : "+ selected.getBrand()+"\nlength : "+ selected.getLength()
        );
    }
}