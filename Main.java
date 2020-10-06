import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dogSixten = new Dog("Sixten", 5000);
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
        boolean inputIsValid = false;
        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

        if (input == null) {
            return;
        }

        for (Animal i : list) {
            if (input.equalsIgnoreCase(i.getName())) {
                i.printFoodAmount();
                inputIsValid = true;
                break;
            }
        }

        if (!(inputIsValid)) {
            JOptionPane.showMessageDialog(null, "Felaktig inmatning! Måste vara ett giltig namn.");
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
