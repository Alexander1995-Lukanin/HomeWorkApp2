package Home.Work_7;


public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() >= appetite) {
            bowl.decreaseFood(appetite);
            satiety = true;
            System.out.printf("Это кот %s съел %d грамм корма.\nСытость кота  %sа: %b \n", name, appetite, name, satiety);
        } else {
            satiety = false;
            System.out.printf("Для кота %sа корма очень мало, он не стал есть. Подсыпте ему корма.\nСытость кота %sа: %b\n", name, name, satiety);
        }
    }
}
