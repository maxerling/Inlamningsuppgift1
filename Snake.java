import javax.swing.*;

/**
 * Created by Max Erling
 * Date: 2020-09-25
 * Copyright: MIT
 * Class: Java20B
 */
public class Snake extends Animal {


    Snake(String name, int weight) {
        super(name, weight);
    }


    @Override
    public void printFoodAmount() {
        JOptionPane.showMessageDialog(null, getName() + " ska få " + getFoodAmount() + "g " + FoodType.SNAKE.foodType);
    }


    @Override
    public int getFoodAmount() {
        return 20;
    }
}
