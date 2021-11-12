package Home.Work_6;

public class Animal {
    protected String Name;

    protected Animal(String Name) {
        this.Name = Name;
    }

    protected void run(int let) {
        System.out.printf("%s пробежал %d м.\n", Name, let);

    }

    protected void sail(int let) {
        System.out.printf("%s проплыл %d м.\n", Name, let);

    }


}
