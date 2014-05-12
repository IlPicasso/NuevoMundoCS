package io.github.dbarrerap;

/**
 * Created by david on 5/12/14.
 */
public class JellyBean extends Dessert {
    public JellyBean(String name) {
        super(name + " Jelly Bean", 5);
    }

    @Override
    public boolean delicious() {
        if (super.getName().contains("licorice") || super.getName().contains("Licorice")) {
            return false;
        }
        return super.delicious();
    }
}
