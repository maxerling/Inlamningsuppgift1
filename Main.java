import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Dog dogSixten = new Dog("Sixten", 5000);
        Dog dogDogge = new Dog("Dogge", 10_000);
        Cat catVenus = new Cat("Venus", 5000);
        Cat catOve = new Cat("Ove", 3000);
        Snake snakeHypno = new Snake("Hypno", 1000);

        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");


        try {
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
        }
    }


}
