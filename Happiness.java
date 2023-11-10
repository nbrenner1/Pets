import java.io.*;
import java.io.Serializable;
import java.util.HashMap;

public class Happiness implements Attribute, Serializable
{
    public HashMap<Integer, String> happinessLevel = new HashMap<>();
    public int happinessIndex;

    public Happiness()  // Initialize happinessLevel HashMap with keys and strings
    {
        happinessLevel.put(0, "Sad");
        happinessLevel.put(1, "Happy");
        happinessLevel.put(2, "Very Happy");
        this.happinessIndex = happinessIndex;
    }

    public void incrementValue()
    {
        System.out.println("Happiness level increased");
        this.happinessIndex += 1;
        if (happinessIndex > 2)  // Increment happiness level unless it is at max
        {
            this.happinessIndex = 2;
        }
    }

    public void decrementValue()
    {
        System.out.println("Happiness level decreased");
        this.happinessIndex -= 1;
        if (happinessIndex < 0)  // Decrement happiness level unless it is at min
        {
            this.happinessIndex = 0;
        }
    }

    public String getValue(int key)  // Get happiness message based on happiness index for the specific pet
    {
        return happinessLevel.get(key);
    }

    public int getCurrentValue()  // Get the happiness index
    {
        return happinessIndex;
    }
}
