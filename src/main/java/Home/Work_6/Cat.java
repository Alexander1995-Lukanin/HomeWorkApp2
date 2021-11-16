package Home.Work_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void run(int let) {
        if (let > 200) {
            System.out.printf(name + " приуныл...\n");
        } else {
            System.out.printf("%s пробежал %d м.\n", name, let);
        }

    }

    public void sail(int let) {
        System.out.printf("%s не умеет плавать, бульк...\n", name);
    }
}
