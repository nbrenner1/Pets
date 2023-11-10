import java.io.*;
import java.io.Serializable;

public class Hedgehog implements Pet, Serializable
{
    public Happiness hedgehogHappiness;
    public Hunger hedgehogHunger;
    public int happinessIndex;
    public int hungerIndex;
    public Color color;

    public Hedgehog(Color color)
    {   // Load state of happiness and hunger
        this.hedgehogHappiness = (Happiness) Filemanager.loadObject("hedgehogHappiness.ser");
        if (hedgehogHappiness == null)  // If null, create a new happiness or hunger attribute
        {
            this.hedgehogHappiness = new Happiness();
        }
        this.hedgehogHunger = (Hunger) Filemanager.loadObject("hedgehogHunger.ser");
        if (hedgehogHunger == null)
        {
            this.hedgehogHunger = new Hunger();
        }
        this.color = color;
    }
    public void play()  // Play method calls methods to increase happiness and hunger
    {
        System.out.println("The hedgehog is running on his wheel");
        hedgehogHappiness.incrementValue();
        hedgehogHunger.incrementValue();
    }

    public void feed()  // Feed method calls method to decrease hunger
    {
        System.out.println("The hedgehog enjoyed his insect meal");
        hedgehogHunger.decrementValue();
    }

    public void makeSound()
    {
        System.out.println("Sniff snuffle snuffle");
    }

    public Happiness getHappiness()   // Returns happiness attribute
    {
        return hedgehogHappiness;
    }

    public Hunger getHunger()   // Returns hunger attribute
    {
        return hedgehogHunger;
    }

    public Color getColor()   // Returns color attribute
    {
        return color;
    }
}
