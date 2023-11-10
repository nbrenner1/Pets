import java.io.*;

interface Attribute
{
    public void incrementValue();

    public void decrementValue();

    public String getValue(int key);

    public int getCurrentValue();
}
