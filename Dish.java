package lesson_7_HW;

public class Dish {
    private int food;
    private int pieces;

    public Dish(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public void info() {
        System.out.printf("В мисочке сейчас %s грамм корма\n", food);
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int pieces) {
        this.food += pieces;
    }
}


