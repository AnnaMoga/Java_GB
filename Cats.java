package lesson_7_HW;

public class Cats {
        private String name;
        private int appetite;
        public boolean isHungry;


        public Cats(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.isHungry = true;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }



        public void setHungry(boolean hungry) {
            isHungry = hungry;
        }

        public void eat(Dish dish) {
            dish.decreaseFood(appetite);
            isHungry = false;
            System.out.println(name + " поела из мисочки");
        }
}
