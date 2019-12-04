class TestMeal {
    public static void main(String[] args) {
        Meal meal1 = new Meal("Meal A", 38.8);
        System.out.println(meal1.toString());
        SpecialMeal meal2 = new SpecialMeal("Meal B", 50.0, 30.0);
        System.out.println(meal2.toString());
    }
}