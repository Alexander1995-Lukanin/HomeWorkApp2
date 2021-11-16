package Home.Work_6;

public class Dog extends Animal {
    public Dog(String Name) {
        super(Name);
    }

    public void run(int let) {
        if (let >500) {
            System.out.printf(Name + " приуныл...\n");
        } else {
            System.out.printf("%s пробежал %d м.\n", Name, let);
        }
    }

    public void sail(int let) {
        if (let > 10) {
            System.out.printf("%s утонул, бедная собака...\n", Name);
        } else {
            System.out.printf("%s проплыл %d м.\n", Name, let);
        }

    }
}

