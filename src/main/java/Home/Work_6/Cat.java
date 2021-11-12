package Home.Work_6;

public class Cat extends Animal {
    public Cat(String Name) {
        super(Name);
    }

    public void run(int let) {
        if (let > 200) {
            System.out.printf(Name + " приуныл...\n");
        } else {
            System.out.printf("%s пробежал %d м.\n", Name, let);
        }

    }

    public void sail(int let) {
        System.out.printf("%s не умеет плавать, бульк...\n", Name);
    }
}
