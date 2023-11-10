import java.io.*;
import java.io.Serializable;
import java.util.Scanner;

public class Owner implements Serializable
{
    public Hedgehog hedgehog = new Hedgehog(Color.BROWN);
    public Orca orca = new Orca(Color.BLACK);
    public Pet chosenPet;

    public Owner(int pet)
    {
        if (pet == 1)  // IF-ELSE logic used to determine which pet was selected
        {
            this.chosenPet = hedgehog;
        }
        else
        {
            this.chosenPet = orca;
        }

        displayMenu();
    }

    public void displayMenu()
    {
        int i=0;
        while (true)   // Menu will continue to be displayed until user quits
        {
            System.out.println();
            System.out.println("Choose from the following:");
            System.out.println("1- play");
            System.out.println("2- feed");
            System.out.println("3- make sound");
            System.out.println("4- view color");
            System.out.println("5- view hunger value");
            System.out.println("6- view happiness value");
            System.out.println("7- quit");
            System.out.println();
            Scanner inputScanner = new Scanner(System.in);
            int userChoice = inputScanner.nextInt();   // Read in user's choice
            System.out.println();

            if (userChoice == 1)
            {
                chosenPet.play();
            }
            else if (userChoice == 2)
            {
                chosenPet.feed();
            }
            else if (userChoice ==3)
            {
                chosenPet.makeSound();
            }
            else if (userChoice == 4)
            {
                System.out.println(chosenPet.getColor());
            }
            else if (userChoice == 5)
            {
                
                System.out.println("Hunger level = " + chosenPet.getHunger().getValue(chosenPet.getHunger().hungerIndex));   // Returns a string corresponding to the current hunger level
            }
            else if (userChoice == 6)
            {
                System.out.println("Happiness level = " + chosenPet.getHappiness().getValue(chosenPet.getHappiness().happinessIndex));  // Returns a string corresponding to the current happiness level
            }
            else
            {
                System.out.println("Your pet will miss you!");
                break;
            }
        }
        // Calls method to save the data at the end of the run
        Filemanager.saveData("hedgehogHappiness.ser", "hedgehogHunger.ser", "orcaHappiness.ser", "orcaHunger.ser", hedgehog.hedgehogHappiness, hedgehog.hedgehogHunger, orca.orcaHappiness, orca.orcaHunger);
    }
}
