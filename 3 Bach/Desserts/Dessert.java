package io.github.dbarrerap;

/**
 * Created by david on 5/12/14.
 */
public class Dessert {
    private String name;
    private int calories;

    public Dessert(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean healthy() {
        if (calories > 200) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delicious() {
        return true;
    }
}
