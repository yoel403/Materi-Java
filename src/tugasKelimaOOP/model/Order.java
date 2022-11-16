package tugasKelimaOOP.model;

public class Order {
    private int total;
    private Foods foods;

    public Order (){}
    public Order(int total, Foods foods) {
        this.total = total;
        this.foods = foods;
    }

    public Order(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Foods getFoods() {
        return foods;
    }

    public void setFoods(Foods foods) {
        this.foods = foods;
    }
    @Override
    public String toString() {
        return  foods + " X " + total;
    }

}
