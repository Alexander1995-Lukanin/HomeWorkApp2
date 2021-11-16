package Home.Work_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void run(int let) {
        if (let >500) {
            System.out.printf(name + " приуныл...\n");
        } else {
            System.out.printf("%s пробежал %d м.\n", name, let);
        }
    }

    public void sail(int let) {
        if (let > 10) {
            System.out.printf("%s утонул, бедная собака...\n", name);
        } else {
            System.out.printf("%s проплыл %d м.\n", name, let);
        }

    }
}

