import java.io.*;
import java.io.Serializable;
import java.util.HashMap;

public class Hunger implements Attribute, Serializable
{
    public HashMap<Integer, String> hungerLevel = new HashMap<>();
    public int hungerIndex;

    public Hunger()
    {
        hungerLevel.put(0, "Not hungry");  // Initialize HashMap with keys and strings
        hungerLevel.put(1, "Hungry");
        hungerLevel.put(2, "Very Hungry");
    }

    public void incrementValue()
    {
        System.out.println("Hunger level increased");
        this.hungerIndex += 1;
        if (hungerIndex > 2)   // Increment hunger level unless it is at its max
        {
            this.hungerIndex = 2;
        }
    }

    public void decrementValue()
    {
        System.out.println("Hunger level decreased");
        this.hungerIndex -= 1;
        if (hungerIndex < 0)  // Decrement hunger level unless it is at its min
        {
            this.hungerIndex = 0;
        }
    }

    public String getValue(int key)   // Get hungar message based on hungar index for the specific animal
    {
        return hungerLevel.get(key);
    }

    public int getCurrentValue()   // Get the hunger index
    {
        return hungerIndex;
    }
}
