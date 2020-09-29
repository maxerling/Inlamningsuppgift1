/**
 * Created by Max Erling
 * Date: 2020-09-25
 * Copyright: MIT
 * Class: Java20B
 */

abstract class Animal implements FoodAmount {
    //Skyddar alla instansvariabler (Encapsulation)
    private String name;
    private int weight;

    Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    //enum
    enum FoodType {
        CAT("kattfoder"),
        DOG("hundfoder"),
        SNAKE("ormpellets");

        public final String foodType;

        FoodType(String food) {
            foodType = food;
        }

    }
}
