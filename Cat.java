import javax.swing.*;

/**
 * Created by Max Erling
 * Date: 2020-09-25
 * Copyright: MIT
 * Class: Java20B
 */
public class Cat extends Animal {


    Cat(String name, int weight) {
        super(name, weight);
    }


    //Overriding från Interface (Polymorphism)
    @Override
    public void printFoodAmount() {
        JOptionPane.showMessageDialog(null, getName() + " ska få " + getFoodAmount() + "g " + FoodType.CAT.foodType);
    }


    @Override
    public int getFoodAmount() {
        return getWeight() / 150;
    }
}
