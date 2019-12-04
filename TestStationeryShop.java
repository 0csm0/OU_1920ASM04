class TestStationeryShop {
    public static void main(String[] args) {
        Ruler[] rulers = new Ruler[]{
            new Ruler("Brand A" ,30),
            new Ruler("Brand B", 20),
            new Ruler("Brand C", 60),
        };
        StationeryShop myStationeryShop = new StationeryShop(rulers);
        myStationeryShop.displayRuler(2);
        myStationeryShop.brandCount("Brand A");
        myStationeryShop.longRulers();
    }
}