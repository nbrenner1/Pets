import java.io.*;
import java.io.Serializable;

public class Orca implements Pet, Serializable
{
    public Happiness orcaHappiness;
    public Hunger orcaHunger;
    public int happinessIndex;
    public int hungerIndex;
    public Color color;

    public Orca(Color color)
    {   // Load state of happiness and hunger
        this.orcaHappiness = (Happiness) Filemanager.loadObject("orcaHappiness.ser");
        if (orcaHappiness == null)   // If null, create a new happiness or hunger attribute
        {
            this.orcaHappiness = new Happiness();
        }
        this.orcaHunger = (Hunger) Filemanager.loadObject("orcaHunger.ser");
        if (orcaHunger == null)
        {
            this.orcaHunger = new Hunger();
        }
        this.color = color;
    }
    public void play()  // Play method calls methods to increase happiness and hunger
    {
        System.out.println("The orca is swimming in his tank");
        orcaHappiness.incrementValue();
        orcaHunger.incrementValue();
    }

    public void feed()  // Feed method calls method to decrease hunger
    {
        System.out.println("The orca enjoyed his seal meal");
        orcaHunger.decrementValue();
    }

    public void makeSound()
    {
        System.out.println("Click click");
    }

    public Happiness getHappiness()  // Returns happiness attribute
    {
        return orcaHappiness;
    }

    public Hunger getHunger()  // Returns hunger attribute
    {
        return orcaHunger;
    }

    public Color getColor()  // Returns color attribute
    {
        return color;
    }
}
