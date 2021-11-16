package Home.Work_7;


public class HomeWork {

    public static void main(String[] args) {
        catsAndBowls();
    }

    private static void catsAndBowls() {
        Cat[] cats = {
                new Cat("Мурзик", 100, false),
                new Cat("Друзик", 100, false),
                new Cat("Грузик", 500, false)
        };
        var bowl = new Bowl();
        bowl.putFood();
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
    }
}
