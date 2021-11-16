package Home.Work_7;

import java.util.Scanner;

public class Bowl {
    private int foodAmount;
    private int bowlSize = 1000;

    public void putFood() {
        System.out.println("Напсыпте котам еды: ");
        Scanner console = new Scanner(System.in);
         int food= console.nextInt();
        this.foodAmount += food;
        System.out.printf("Вы подсыпали в миску %d  грамм корма, сейчас в миске %s грамм\n", food, foodAmount);
        if (foodAmount >= bowlSize) {
            foodAmount = bowlSize;
            System.out.println("Миска полна, в ней " + foodAmount + " грамм корма");
        }
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
        System.out.printf("Кто то съел из миски %d  грамм корма, сейчас в миске %s грамм\n", amount, foodAmount);
        if (foodAmount <= 0) {
            foodAmount = 0;
            System.out.println("Миска пуста, в ней " + foodAmount + " грамм корма");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
