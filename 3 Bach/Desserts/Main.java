package io.github.dbarrerap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JellyBean jb1 = new JellyBean("Strawberry");
        JellyBean jb2 = new JellyBean("Licorice");
        Dessert banasplit = new Dessert("Banana Split", 894);
        Dessert bakedapple = new Dessert("Baked Apple, unsweetened", 127);

        System.out.println(jb1.getName());
        System.out.println(jb1.delicious());
        System.out.println(jb1.getCalories());
        System.out.println(jb1.healthy());

        System.out.println(jb2.getName());
        System.out.println(jb2.delicious());
        System.out.println(jb2.getCalories());
        System.out.println(jb2.healthy());

        System.out.println(banasplit.getName());
        System.out.println(banasplit.delicious());
        System.out.println(banasplit.getCalories());
        System.out.println(banasplit.healthy());

        System.out.println(bakedapple.getName());
        System.out.println(bakedapple.delicious());
        System.out.println(bakedapple.getCalories());
        System.out.println(bakedapple.healthy());
    }
}
