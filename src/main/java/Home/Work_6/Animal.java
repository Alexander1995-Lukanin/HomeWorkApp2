package Home.Work_6;

public class Animal {
    protected String name;

    protected Animal(String Name) {
        this.name = Name;
    }

    protected void run(int let) {
        System.out.printf("%s пробежал %d м.\n", name, let);

    }

    protected void sail(int let) {
        System.out.printf("%s проплыл %d м.\n", name, let);

    }


}
