public class Main {
    public static void main(String[] args) {
        Meat meal1 = new HamburgerMeal();
        meal1.doMeal();

        System.out.println();

        Meat meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
