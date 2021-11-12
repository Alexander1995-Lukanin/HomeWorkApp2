package Home.Work_6;

public class Start {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барс");
        Cat cat2 = new Cat("Пушистик");
        Dog dog1 = new Dog("Барбос");
        Dog dog2 = new Dog("Макхонахи");
        cat1.run(520);
        cat2.run(100);
        cat2.sail(200);
        dog1.run(1000);
        dog1.run(499);
        dog2.sail(5);
        dog2.sail(11);

        Animal[] сollection = new Animal[]{
                new Cat("Барсик"),
                new Cat("Тузик"),
                new Dog("Дружок"),
                new Dog("Пирожок"),
                new Cat("Туська"),
                new Animal("Лошадь"),
                new Animal("Корова")
        };
        countAnimal(сollection);
    }

    public static void countAnimal(Animal[] collection) {
        int countCat = 0;
        int countDog = 0;
        int countAnimal = 0;
        for (int i = 0; i < collection.length; i++) {

            if (collection[i] instanceof Cat) {
                countCat++;
            }
            if (collection[i] instanceof Animal) {
                countAnimal++;
            }
            if (collection[i] instanceof Dog) {
                countDog++;
            }

        }
        System.out.println("Всего котов: " + countCat);
        System.out.println("Всего собак: " + countDog);
        System.out.println("Другие животные: " + (countAnimal - countCat - countDog));
        System.out.println("Всего животных: " + countAnimal);

    }

}
