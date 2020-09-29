import javax.swing.*;

/**
 * Created by Max Erling
 * Date: 2020-09-25
 * Copyright: MIT
 * Class: Java20B
 */
public class Dog extends Animal {


    Dog(String name, int weight) {
        super(name, weight);
    }


    @Override
    public void printFoodAmount() {
        JOptionPane.showMessageDialog(null, getName() + " ska få " + getFoodAmount() + "g " + FoodType.DOG.foodType);
    }


    @Override
    public int getFoodAmount() {
        return getWeight() / 100;
    }


}
