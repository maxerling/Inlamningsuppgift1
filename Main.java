import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dogSixten = new Dog("Sixten", 5000); //lista, loopar igenom istället för if-sats
        Animal dogDogge = new Dog("Dogge", 10_000);
        Animal catVenus = new Cat("Venus", 5000);
        Animal catOve = new Cat("Ove", 3000);
        Animal snakeHypno = new Snake("Hypno", 1000);
        ArrayList<Animal> list = new ArrayList<>();
        list.add(dogSixten);
        list.add(dogDogge);
        list.add(catVenus);
        list.add(catOve);
        list.add(snakeHypno);
        String input = JOptionPane.showInputDialog("What animal should get food?");
        boolean inputIsValid = true;

//"Outside and before the for loop,
// initialize a bool variable that will serve to record whether the condition is true or not." You can just name that boolean variable "inputIsValid" if that helps
        try {
            for (Animal i : list) {
                if (input.equalsIgnoreCase(i.getName())) {
                    i.printFoodAmount();
                    inputIsValid = true;
                    break;
                }
                inputIsValid = false;
            }
        } catch (NullPointerException e) {
            System.exit(0);
        }

        if (!(inputIsValid)) {
            JOptionPane.showMessageDialog(null, "Wrong input! Needs to be valid name.");
        }




        /*try {
            for (int i = 0; i < list.size(); i++) {
                if (input.equalsIgnoreCase(list.get(i).getName())) {
                    list.get(i).printFoodAmount();
                    break;
                } else if (i == list.size() - 1) {
                    JOptionPane.showMessageDialog(null, "Wrong input! Needs to be valid name.");
                }
            }
        } catch (NullPointerException e) {
            System.exit(0);
        }*/

        /*try {
            if (input.equalsIgnoreCase(catVenus.getName())) {
                catVenus.printFoodAmount();
            } else if (input.equalsIgnoreCase(dogDogge.getName())) {
                dogDogge.printFoodAmount();
            } else if (input.equalsIgnoreCase(dogSixten.getName())) {
                dogSixten.printFoodAmount();
            } else if (input.equalsIgnoreCase(catOve.getName())) {
                catOve.printFoodAmount();
            } else if (input.equalsIgnoreCase(snakeHypno.getName())) {
                snakeHypno.printFoodAmount();
            } else {
                JOptionPane.showMessageDialog(null, "Felaktig inmatning! Bidra med ett giltigt namn.");
            }
        } catch (NullPointerException e) {
            System.exit(0);
        }*/

    }


}
